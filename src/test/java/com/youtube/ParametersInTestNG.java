package com.youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParametersInTestNG {


    public WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void setUp(String browser, String url){

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("safari")){

            driver = new SafariDriver();

        }else{

            throw  new RuntimeException("Wrong browser type");

        }

        driver.get(url);

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
