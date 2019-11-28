package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {

    private WebDriver driver;

    @FindBy (xpath = "//body//b//input[2]")
    private WebElement typeOneWay;

    @FindBy (xpath = "//select[@name='passCount']")
    private WebElement passengersWE;

    @FindBy (xpath = "//select[@name='fromPort']")
    private WebElement departingFromWE;

    @FindBy (xpath = "//select[@name='fromMonth']")
    private WebElement departingMonthWE;

    @FindBy (xpath = "//select[@name='fromDay']")
    private WebElement departingDayWE;

    @FindBy (xpath = "//select[@name='toPort']")
    private WebElement arrivingInWE;

    @FindBy (xpath = "//select[@name='toMonth']")
    private WebElement returningMonthWE;

    @FindBy (xpath = "//select[@name='toDay']")
    private WebElement returningDayWE;

    @FindBy (xpath = "//input[@value='First']")
    private WebElement serviceClassFirst;

    @FindBy (xpath = "//select[@name='airline']")
    private WebElement airlineWE;

    @FindBy (xpath = "//input[@name='findFlights']")
    private WebElement continueButton;

    public FlightFinderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void selectOnAllSelects() {
        Select passengers = new Select(passengersWE);
        Select departingFrom = new Select(departingFromWE);
        Select departingMonth = new Select(departingMonthWE);
        Select departingDay = new Select(departingDayWE);
        Select arrivingIn = new Select(arrivingInWE);
        Select returningMonth = new Select(returningMonthWE);
        Select returningDay = new Select(returningDayWE);
        Select airline = new Select(airlineWE);

        passengers.selectByVisibleText("3");
        departingFrom.selectByVisibleText("New York");
        departingMonth.selectByVisibleText("May");
        departingDay.selectByVisibleText("9");
        arrivingIn.selectByVisibleText("Paris");
        returningMonth.selectByVisibleText("June");
        returningDay.selectByVisibleText("22");
        airline.selectByVisibleText("Blue Skies Airlines");
    }

    private void clickOnTypeOneWay() {
        typeOneWay.click();
    }

    private void clickOnServiceClassFirst() {
        serviceClassFirst.click();
    }

    private void clickOnContinueButton() {
        continueButton.click();
    }

    public void setFlightFinder() {
        clickOnTypeOneWay();
        selectOnAllSelects();
        clickOnServiceClassFirst();
        clickOnContinueButton();
    }
}
