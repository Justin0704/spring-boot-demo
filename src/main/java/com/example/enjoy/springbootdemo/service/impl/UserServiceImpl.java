package com.example.enjoy.springbootdemo.service.impl;

import com.example.enjoy.springbootdemo.dao.UserMapper;
import com.example.enjoy.springbootdemo.model.User;
import com.example.enjoy.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean login(String username, String password) {
        User user = userMapper.findByUsernameAndPassword(username, password);
        return user != null;
    }

    @Override
    public boolean register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        int cnt = userMapper.insertSelective(user);
        return cnt > 0;
    }

    @Override
    @Transactional
    public void batchAdd(String username, String password) {
        User users = new User();
        users.setUsername(username);
        users.setPassword(password);
        userMapper.insertSelective(users);
        //int i = 10 /0;
        users = new User();
        users.setUsername(username+"2");
        users.setPassword(password);
        userMapper.insertSelective(users);
    }


}
