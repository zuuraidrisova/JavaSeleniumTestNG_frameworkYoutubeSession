package com.parallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest {


    @Test
    public void testLogoIsDisplayed(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo =  driver.findElement(By.xpath("//div[@id='divLogo']/img"));

        Assert.assertTrue(logo.isDisplayed());

        System.out.println("Logo verification Passed");

        driver.close();

    }

    @Test
    public void testPageTitle(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title verification Passed");

        driver.close();
    }


}
