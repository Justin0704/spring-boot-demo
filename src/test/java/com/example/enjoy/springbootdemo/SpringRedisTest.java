package com.example.enjoy.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringbootdemoApplication.class)
@RunWith(SpringRunner.class)
public class SpringRedisTest {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis(){
        ValueOperations<String,String> ops = redisTemplate.opsForValue();
        ops.set("mykey","zhangsan");
        String value = ops.get("mykey");
        System.out.println("value = " + value);
    }
}
