package com.example.ringzero.config;

import redis.embedded.RedisServer;

public class RedisTestConfig {

    public static RedisServer redisServer;

    static {
        redisServer = RedisServer.builder()
                .setting("requirepass iworks4711")
                .port(6379)
                .build();
        redisServer.start();

        while (!redisServer.isActive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
