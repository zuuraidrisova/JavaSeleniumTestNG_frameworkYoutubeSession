package com.youtube;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    public void setUp(){

        System.out.println("Opening browser");
    }

    @Test(invocationCount = 3)
    public void login(){

        System.out.println("Logging in");
    }

    @Test
    public void tearDown(){

        System.out.println("Closing browser");
    }
}
