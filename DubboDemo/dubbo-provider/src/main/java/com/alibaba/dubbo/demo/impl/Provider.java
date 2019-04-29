package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yaoyao on 2019/4/28.
 */
public class Provider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ":here");
        context.start();
        System.out.println("服务已经启动...");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("异常了" + e.getMessage());
        }
    }
}
