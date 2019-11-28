package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy (xpath = "//input[@name='userName']")
    private WebElement userName;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy (xpath = "//input[@name='login']")
    private WebElement loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void setUserName(String str) {
        userName.sendKeys(str);
    }

    private void setPassword(String str) {
        password.sendKeys(str);
    }

    private void clickOnLoginButton() {
        loginButton.click();
    }

    public void login(String strUserName, String strPassword) {
        setUserName(strUserName);
        setPassword(strPassword);
        clickOnLoginButton();
    }
}
