package com.youtube;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn_AlwaysRun_Properties {

    @Test
    public void startCar(){

        System.out.println("Car started");

        Assert.fail();
        //if first method fails, the rest of the test will be ignored
    }

    @Test(dependsOnMethods = "startCar")
    public void driveCar(){

        System.out.println("Driving");
    }

    @Test(dependsOnMethods = "driveCar")
    public void stopCar(){

        System.out.println("Car stopped");
    }

    //alwaysRun = true property will run the method no matter what, even if dependent
    @Test(dependsOnMethods = {"stopCar", "driveCar"}, alwaysRun = true)
    public void parkCar(){

        System.out.println("Car parked");
    }

}
