package com.youtube;

import org.testng.annotations.Test;

public class Priority_Ignore_Example {

    //to give priority to test we use parameter priority inside () in @Test
    //when enable parameter is set to true, it will run the test,
    // when enable is set to false it will ignore the test

    @Test(priority = 4, invocationCount = 2, enabled = true)
    public void test1(){

        System.out.println("this is test 1 ...");
    }

    @Test(priority = 3, invocationCount = 2, enabled = false)
    public void test2(){

        System.out.println("this is test 2 ...");
    }

    @Test(priority = 2, invocationCount = 2, enabled = false)
    public void test3(){

        System.out.println("this is test 3 ...");
    }

    @Test(priority = 1, invocationCount = 2, enabled = true)
    public void test4(){

        System.out.println("this is test 4 ...");
    }
}
