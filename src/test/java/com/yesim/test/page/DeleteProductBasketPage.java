package com.yesim.test.page;

import com.yesim.test.contracts.IAddToBasketPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToBasketPage extends BasePageUtil implements IAddToBasketPage {
    public By deleteBtn = By.className("removeProd svgIcon svgIcon_trash"); //delete button

    @Override
    public void clickDeleteButton() {
        clickElement(deleteBtn);
        System.out.println("Ürün silme işlemi gerçekleştirildi...");
    }

    @Override
    public void checkEmptyBasket() {

        IWebElement SilinmeOnayi = driver.FindElement(By.ClassName("title"));
        Assert.True(SilinmeOnayi.Text.Contains("Sepetiniz Boş"));
    }
}