package com.example.enjoy.springbootdemo.exception;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)//捕获RuntimeExcpetion
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest request,Exception ex) throws Exception{
        ex.printStackTrace();
        return "我是个异常处理类";
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return (factory -> {
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404.do");
            factory.addErrorPages(error404Page);
        });
    }


}
