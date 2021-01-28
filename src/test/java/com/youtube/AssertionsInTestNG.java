package com.youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionsInTestNG {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testLogoIsDisplayed(){

        WebElement logo =  driver.findElement(By.xpath("//div[@id='divLogo']/img"));

        Assert.assertTrue(logo.isDisplayed());

        System.out.println("Logo verification Passed");
    }

    @Test
    public void testPageTitle(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title verification Passed");
    }


    @AfterClass
    public void tearDown(){

        driver.close();
    }

}
