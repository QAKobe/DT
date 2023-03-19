package com.Zhanna_php.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.DriverHelper;

public class Zhanna_php_testBase {
    public WebDriver driver;
    @BeforeSuite
    public void clearTheCashes(){
        driver=DriverHelper.getDriver();
        driver.manage().deleteAllCookies();
    }



    @BeforeMethod  //it will run febore everything
    public void setup() {
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("URLKUBA"));
    }


}
