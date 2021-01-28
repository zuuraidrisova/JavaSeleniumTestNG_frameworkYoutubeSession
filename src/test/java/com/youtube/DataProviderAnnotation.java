package com.youtube;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

    // dataProvider is used for DDT


    @DataProvider(name = "LoginData")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.com", "abc"},{"xyz@gmail.com", "xyz"},{"mno@gmail.com", "mno"}};

        return data;
    }


    @Test(dataProvider = "LoginData")
    public void loginTest(String username, String password){

        System.out.println(username+" "+ password);
    }


}
