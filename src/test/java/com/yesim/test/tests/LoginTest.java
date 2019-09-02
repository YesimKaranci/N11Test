package com.yesim.test.tests;


import com.yesim.test.contracts.IHomePage;
import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.page.HomePage;
import com.yesim.test.page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginTest {

    public ILoginPage loginPage = new LoginPage();
    public IHomePage homePage = new HomePage();

    @Given("^Web sitesinde açılan sayfadan giriş yap butonuna tıklanır$")
    public void webSitesindeAçılanSayfadanGirişYapButonunaTıklanır() {

        homePage.clickLoginButton();
    }

    @When("^Web sitesine başarılı giriş için ([^\"]*) ve ([^\"]*) yazılır$")
    public void webSitesineBaşarılıGirişIçinEmailVePasswordYazılır(String email, String password) {
        loginPage.login(email, password);
    }

    @And("^Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır$")
    public void girişYapEkranındaGirilenGeçerliBilgilerdenSonraGirişButonunaTıklanır() {
        loginPage.clickButtonLogin();

    }

    @Then("^Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir$")
    public void başarılıGirişYapıldığınaDairAnasayfanınGeldiğiKontrolEdilir() {
        homePage.checkSuccessfulLogin();
    }



