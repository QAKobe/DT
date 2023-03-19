package com.Chynara_php.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainClassC_Chynara {
    public MainClassC_Chynara(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@name='business_name']")
    WebElement businessName;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//button[@id='demo']")
    WebElement submitButton;
    @FindBy(xpath = "//span[@id='numb1']")
    WebElement number1;
    @FindBy(xpath = "//span[@id='numb2']")
    WebElement number2;
    @FindBy(xpath = "//input[@id='number']")
    WebElement resultNumber;
    public void validateAll(String fName, String lName, String bName, String eMail){
        this.firstName.sendKeys(fName);
        this.lastName.sendKeys(lName);
        this.businessName.sendKeys(bName);
        this.email.sendKeys(eMail);
        int a = Integer.parseInt(BrowserUtils.getText(number1));
        int b = Integer.parseInt(BrowserUtils.getText(number2));
        int res = a+b;
        String result = String.valueOf(res);
        resultNumber.sendKeys(result);
        submitButton.click();

    }

}
