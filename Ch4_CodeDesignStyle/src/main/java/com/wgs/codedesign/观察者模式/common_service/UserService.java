package com.wgs.codedesign.观察者模式.common_service;

/**
 * @author: wanggenshen
 * @date: 2020/4/7 13:07.
 * @description: XXX
 */
public class UserService {

    public long register(String phone, String password) {
        System.out.println("用户注册成功");
        long userId = 1000;
        return userId;
    }
}
