package com.richit;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

public class Test_LP {
    public static void main(String[] args) {
        RedisClient redisClient = RedisClient
                .create("redis://DenMmjv8CZY@192.168.15.188:6379/");
        StatefulRedisConnection<String, String> connection
                = redisClient.connect();
        System.out.println("Connected to Redis");
        RedisCommands<String, String> syncCommands = connection.sync();

        String value = syncCommands.get("giros:9965");
        System.out.println(value);
        redisClient.shutdown();
    }
}
