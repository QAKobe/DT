package com.Zhanna_php.tests;

import com.Zhanna_php.pages.AllData;
import com.Zhanna_php.pages.Zhanna_phpMain;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Zhanna_Test extends Zhanna_php_testBase{
   @Test(dataProvider = "PhPData",dataProviderClass = AllData.class )
   public void validate(String firstname,String lastname,String bussiness,String email) throws InterruptedException {
      Zhanna_phpMain zhannaPhpMain=new Zhanna_phpMain(driver);
      zhannaPhpMain.validate(firstname, lastname, bussiness, email);
   }

}
