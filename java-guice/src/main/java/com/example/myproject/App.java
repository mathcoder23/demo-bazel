package com.example.myproject;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class App {


  public static void main(String... args) throws Exception {
    Injector injector = Guice.createInjector(new MyAppModule());
    LogService logService = injector.getInstance(LogService.class);
    logService.log("Hello Guice");
  }

}
