package com.youtube;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {


    @Test
    public void setUp(){

        System.out.println("Opening browser");
    }

    @Test(priority = 1)
    public void login(){

        System.out.println("Logging in");
    }

    @Test(priority = 2)
    public void addCustomer(){

        Assert.assertEquals(1,1);
        System.out.println("Adding a new customer");
    }

    @Test(priority = 3)
    public void searchCustomer(){

        System.out.println("Searching for customer");
    }

    @Test(priority = 4)
    public void tearDown(){

        System.out.println("Closing browser");
    }

}
