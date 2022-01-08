package com.example.ringzero.controller.user.service;

import com.example.ringzero.controller.user.api.UsersApiDelegate;
import com.example.ringzero.controller.user.model.Result;
import com.example.ringzero.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class UserService implements UsersApiDelegate {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<Result> getUser(HttpServletRequest request) {
        return ResponseEntity.ok(userRepository.getUser(request));
    }
}
