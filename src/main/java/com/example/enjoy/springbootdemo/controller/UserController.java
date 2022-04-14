package com.example.enjoy.springbootdemo.controller;

import com.example.enjoy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public String login(String username,String password){
        boolean login = userService.login(username, password);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String password) {
        boolean login = userService.register(username, password);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }

    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String password) {
        userService.batchAdd(username, password);
        return "成功";
    }
}
