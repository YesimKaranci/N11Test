package com.yesim.test.page;

import com.yesim.test.contracts.IHomePage;
import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.tests.BaseTest;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BasePageUtil implements IHomePage {

    public By btnSignIn = By.className("btnSignIn");
    public By kesfet = By.className("trending-title");
    public By kitap = By.className("trending-items-title");
    public By MYACCOUNT=By.id("myAccount");

    @Override
    public void callLoginPage() {
        clickElement(btnSignIn);
    }

    @Override
    public void checkSuccessfulLogin() {

        Assert.assertFalse("Başarılı giriş yapıldı!",isEnabled(btnSignIn));
    }

}
