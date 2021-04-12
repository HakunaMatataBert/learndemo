package com.learn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Random;

@SpringBootTest
class RedisdemoApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    void contextLoads() {

        redisTemplate.opsForValue().set("ppp","ppp");
        String aa = (String) redisTemplate.opsForValue().get("1232");
        System.err.println("获得的值："+aa);
    }

}
