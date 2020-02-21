package com.richit;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

import java.util.Map;

public class Test_lettuce {
    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis://localhost:6379/");
        StatefulRedisConnection<String, String> connection = redisClient.connect(); //Open a Redis Stadalone connection
        System.out.println("Connected to Redis");
        RedisCommands<String, String> syncCommands = connection.sync();

        try{
            syncCommands.set("key", "Hello, Redis!");
            String value = syncCommands.get("key");
            syncCommands.hset("recordName", "FirstName", "John");
            syncCommands.hset("recordName", "LastName", "Smith");
            Map<String, String> record = syncCommands.hgetall("recordName");

            System.out.println(value);
            System.out.println(record);

        } catch (Exception e){
            e.printStackTrace();
        }

        connection.close(); //Close the connection
        redisClient.shutdown(); //Shut down the client instance
    }
}
