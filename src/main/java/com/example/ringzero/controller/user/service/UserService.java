package com.example.ringzero.controller.user.service;

import com.example.ringzero.client.UserRandomUtil;
import com.example.ringzero.controller.user.api.UsersApiDelegate;
import com.example.ringzero.controller.user.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service
@Slf4j
public class UserService implements UsersApiDelegate {

    @Value("${user.random.api}")
    private String userRandomUrl;

    private final UserRandomUtil userRandomUtil;

    public UserService(UserRandomUtil userRandomUtil) {
        this.userRandomUtil = userRandomUtil;
    }

    @Override
    public ResponseEntity<Result> getUser(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(userRandomUtil.readJsonFromUrl(userRandomUrl, request));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return (ResponseEntity<Result>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
