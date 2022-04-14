package com.example.enjoy.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public Object error_404(){
        return "您的页面找不到了-----404";
    }


}
