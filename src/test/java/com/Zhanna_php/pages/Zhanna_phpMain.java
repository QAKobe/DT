package com.Zhanna_php.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class Zhanna_phpMain {
    public Zhanna_phpMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstname;
    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastname;
    @FindBy(xpath = "//input[@name='business_name']")
    WebElement bussiness;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//button[@id='demo']")
    WebElement submitButton;
    @FindBy(xpath = "//span[@id='numb1']")
    WebElement firstNum;
    @FindBy(xpath = "//span[@id='numb2']")
    WebElement secondNum;
  @FindBy(xpath = "//input[@placeholder='Result ?']")
    WebElement resulte;

  public void validate(String firstname,String lastname,String bussiness,String email) throws InterruptedException {
      this.firstname.sendKeys(firstname);
      this.lastname.sendKeys(lastname);
      this.bussiness.sendKeys(bussiness);
      this.email.sendKeys(email);
      Thread.sleep(5000);
      String number= BrowserUtils.getText(firstNum);
      String number2=BrowserUtils.getText(secondNum);
   int numb=Integer.parseInt(number);
   int numb2=Integer.parseInt(number2);
   int result=numb+numb2;
   Thread.sleep(3000);//first i need to move this one to the result and
      this.resulte.sendKeys(String.valueOf(result));
      submitButton.click();
  // Assert.assertEquals(result,resulte);
  }

}

