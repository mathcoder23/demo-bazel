package com.example.myproject;

import com.google.inject.Singleton;

@Singleton
public class LogServiceImpl implements LogService {
    @Override
    public void log(String content) {
        System.out.println("guice log:" + content);
    }
}
