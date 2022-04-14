package com.example.enjoy.springbootdemo.service;

public interface UserService {
    public boolean login(String username, String password);

    public boolean register(String username,String password);

    void batchAdd(String username,String password);
}
