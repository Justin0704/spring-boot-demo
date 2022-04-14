package com.example.enjoy.springbootdemo;

import com.example.enjoy.springbootdemo.dao.UserMapper;
import com.example.enjoy.springbootdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringbootdemoApplication.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testAdd(){
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("222222");
        userMapper.insertSelective(user);

    }

    @Test
    public void testFindUser(){
        User user = userMapper.findByUsernameAndPassword("lisi","222222");
        System.out.println(user != null ? user.toString() : null);
    }


}
