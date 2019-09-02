package com.yesim.test.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

    protected static WebDriver driver;
    private final String driverName = "webdriver.chrome.driver";
    private final String driverPath = "./drivers/chromedriver";
    private final String url = "https://www.n11.com";

    public static WebDriver getDriver() { return driver; }

    @Before
    public void setup(){
        System.setProperty(driverName,driverPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @After
    public void close(){
        driver.quit(); //tarayıcıyı kapat
    }

}
