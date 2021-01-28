package com.youtube;

import org.testng.annotations.*;

public class FourthTestCase {


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
    public void test3(){

        System.out.println("this is test 3....");
    }

    @Test
    public void test4(){

        System.out.println("this is test 4....");
    }



}
