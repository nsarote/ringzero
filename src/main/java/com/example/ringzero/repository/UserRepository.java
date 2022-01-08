package com.example.ringzero.repository;

import com.example.ringzero.controller.user.model.Result;

import javax.servlet.http.HttpServletRequest;

public interface UserRepository {
    Result getUser(HttpServletRequest request);

}
