package com.example.enjoy.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tpl")
public class ThymeleafController {

    @RequestMapping("/test")
    public String testThymeleaf(ModelMap map){

        map.addAttribute("name","李建");
        return "testThymleaf";
    }
}
