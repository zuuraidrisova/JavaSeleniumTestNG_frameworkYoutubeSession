package com.youtube;

import org.testng.annotations.*;

public class ThirdTestCase {

    @BeforeTest
    public void beforeTest(){

        System.out.println("this method will run before anything in test suite");
    }

    @AfterTest
    public void afterTest(){

        System.out.println("this method will run after anything in test suite");
    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("this method will run once before anything in this class");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("this method will run once after anything in this class");

    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("this method will run before each method");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("this method will run after each method");
    }

    @Test
    public void test1(){

        System.out.println("this is test 1...");
    }

    @Test
    public void test2(){

        System.out.println("this is test 2...");
    }



}
