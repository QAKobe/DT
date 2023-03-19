package com.kuba_php.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainClass {

    public MainClass(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameTest;

    @FindBy(xpath = "//input[@name='business_name']")
    WebElement businessNameField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//span[@id='numb1']")
    WebElement number1;

    @FindBy(xpath = "//span[@id='numb2']")
    WebElement number2;

    @FindBy(xpath = "//input[@id='number']")
    WebElement inputAnswer;

    @FindBy(xpath = "//button[@id='demo']")
    WebElement submitBtn;

    public void fillOutForm(String name, String lastName, String businessName, String email) throws InterruptedException {
        firstName.sendKeys(name);
        lastNameTest.sendKeys(lastName);
        businessNameField.sendKeys(businessName);
        emailField.sendKeys(email);

        Thread.sleep(2000);
        int num1 = Integer.parseInt(BrowserUtils.getText(number1));
        int num2 = Integer.parseInt(BrowserUtils.getText(number2));

        int answer = num1 + num2;
        Thread.sleep(2000);
        String str = String.valueOf(answer);

        inputAnswer.sendKeys(str);

        submitBtn.click();

    }

}
