package com.example.myproject;

import com.google.inject.AbstractModule;

public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(LogService.class).to(LogServiceImpl.class);
    }
}