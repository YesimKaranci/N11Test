package com.yesim.test.page;

import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePageUtil implements ILoginPage {


    public By EMAIL=By.id("email");
    public By PASSWORD=By.id("password");
    public By BTN_LOGİN=By.id("loginButton");

    @Override
    public ILoginPage login(String email, String password) {

        sendKeys(EMAIL,email);
        sendKeys(PASSWORD,password);
        return new LoginPage();
    }

    @Override
    public void clickButtonLogin() {
        clickElement(BTN_LOGİN);
    }

}
