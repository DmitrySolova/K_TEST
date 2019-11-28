package com.newtoursDemoaut.test;

import com.newtoursDemoaut.pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KingSolo\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    public void testHomePage() {
        HomePage HomePage = new HomePage(driver);
        HomePage.login("test1", "test1");
    }

    @Test
    public void testFlightFinderPage() {
        FlightFinderPage FlightFinderPage = new FlightFinderPage(driver);
        FlightFinderPage.setFlightFinder();
    }

    @Test
    public void testSelectFlightPage() {
        SelectFlightPage SelectFlightPage = new SelectFlightPage(driver);
        SelectFlightPage.setFlight();
    }

}
