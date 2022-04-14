package com.example.enjoy.springbootdemo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation(value="获取用户信息",notes = "根据id获取用户详细信息")
    @ApiImplicitParam(name="id",value = "用户id",required = true,dataType = "string")
    @GetMapping("/{id}")
    public Map<String,String> getInfo(@PathVariable String id){
        Map<String,String> paraMap = new HashMap<>();
        paraMap.put("name","lijian");
        paraMap.put("password","111111");
        return paraMap;
    }
}
