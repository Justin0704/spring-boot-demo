package com.example.enjoy.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/hi")
    public String sayHi(){
        return "index";
    }
}
