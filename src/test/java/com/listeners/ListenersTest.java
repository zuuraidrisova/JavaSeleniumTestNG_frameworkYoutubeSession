package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.CustomListener.class)
public class ListenersTest {


    @Test
    public void test1(){

        System.out.println("test 1 ...");

        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){

        System.out.println("test 2 ...");

        Assert.assertEquals(1,2);
    }

    @Test
    public void test3(){

        System.out.println("test 3 ...");

        throw  new SkipException("this is Skip Exception coming from TestNG");
    }

}
