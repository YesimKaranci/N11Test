package com.yesim.test.util;


import com.yesim.test.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public abstract class BasePageUtil {

    public WebDriver driver = BaseTest.getDriver();


    public void clickElement(By element) {
        find(element).click();
    }

    public WebElement find(By element){
        //elementi 10 sn ara bulamazsan patlat
        WebDriverWait wait=new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void sendKeys(By element, String text) {
        find(element).sendKeys(text);
    }

    public boolean isElementDisplayed(By element) {
        return find(element).isDisplayed();
    }

    public String getText(By element) {
        return find(element).getText();
    }

    public boolean isEnabled(By element) {
       return  find(element).isEnabled();
    }

    public WebElement swipeToElement(By by){
        WebElement element = find(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

   public void clickElementOnList (By by, int index){
        //WebDriverWait wait=new WebDriverWait(driver,5);
        driver.findElements(by).get(index).click();
   }

   public void getAttribute(By by, String text ){

       driver.findElement(by).getAttribute(text);
   }


}


