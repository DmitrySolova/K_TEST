package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {

    private WebDriver driver;

    @FindBy(xpath = "((//input[contains(@name, 'outFlight')][contains(@value, 'Blue Skies Airlines')])[2])")
    private WebElement BSA361; //Blue Skies Airlines 361

    @FindBy(xpath = "//input[contains(@name, 'inFlight')][contains(@value, 'Unified Airlines')]")
    private WebElement UA633; //Unified Airlines 633

    @FindBy(xpath = "//input[@name='reserveFlights']")
    private WebElement continueButton;

    public SelectFlightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void clickOnBSA361() {
        BSA361.click();
    }

    private void clickOnUA633() {
        UA633.click();
    }

    private void clickOnContinueButton() {
        continueButton.click();
    }

    public void setFlight() {
        clickOnBSA361();
        clickOnUA633();
        clickOnContinueButton();
    }

}
