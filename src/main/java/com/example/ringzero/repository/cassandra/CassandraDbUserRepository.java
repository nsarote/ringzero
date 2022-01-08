package com.example.ringzero.repository.cassandra;

import com.example.ringzero.controller.user.model.Result;
import com.example.ringzero.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class CassandraDbUserRepository implements UserRepository {

    @Override
    public Result getUser(HttpServletRequest request) {
        return null;
    }

}
