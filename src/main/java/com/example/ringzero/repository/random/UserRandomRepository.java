package com.example.ringzero.repository.random;

import com.example.ringzero.controller.user.model.Result;
import com.example.ringzero.repository.UserRepository;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class UserRandomRepository implements UserRepository {

    @Value("${user.random.api}")
    private String userRandomUrl;

    @Value("${user.cacheSeedInMinute}")
    private int cacheSeedInMinute;

    @Autowired
    private RedisTemplate redisTemplate;

    public Result getUser(HttpServletRequest request) {
        try {
            String url = userRandomUrl;
            if (request != null && StringUtils.isNotBlank(request.getQueryString())) {
                url += "?" + request.getQueryString();
            }
            log.info("url : {}", url);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            Result result = null;
            if (request.getParameterMap().size() == 1 && request.getParameterMap().containsKey("seed")) {
                String redisKey = "seed";
                String hashKey = request.getParameterMap().get("seed")[0];
                if (redisTemplate.opsForHash().hasKey(redisKey, hashKey)) {
                    result = (Result) redisTemplate.opsForHash().get(redisKey, hashKey);
                } else {
                    result = mapper.readValue(new URL(url), Result.class);
                    redisTemplate.opsForHash().put(redisKey, hashKey, result);
                    redisTemplate.expire(redisKey, cacheSeedInMinute, TimeUnit.MINUTES);
                }
            } else {
                result = mapper.readValue(new URL(url), Result.class);
            }
            return result;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

}
