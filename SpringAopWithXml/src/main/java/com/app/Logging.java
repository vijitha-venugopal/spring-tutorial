package com.app;

/**
 * method class
 * Created by vijitha on 07/09/16.
 */
public class Logging {
    public void beforeAdvice(){
        System.out.println("Start");
    }
    public void afterAdvice(){
        System.out.println("End");
    }
}
