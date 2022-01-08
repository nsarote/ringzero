package com.example.ringzero.config;

import com.example.ringzero.repository.UserRepository;
import com.example.ringzero.repository.random.UserRandomRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    UserRepository userRepository(UserRandomRepository userRandomRepository) { //MongoDbUserRepository
        return userRandomRepository;
    }
}
