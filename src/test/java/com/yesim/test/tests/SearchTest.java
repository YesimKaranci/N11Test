package com.yesim.test.tests;

import com.yesim.test.contracts.ISearchPage;
import com.yesim.test.page.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchTest {
    public ISearchPage searchPage=new SearchPage();

    @Then("^Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir$")
    public void girişYaptıktanSonraAramaBölümününGeldiğiKontrolEdilir() {
        searchPage.checkSearchSection();
    }


    @And("^Anasayfada arama alanına ([^\"]*) yazılır ve arama butonuna tıklanır$")
    public void anasayfadaAramaAlanınaProductYazılırVeAramaButonunaTıklanır(String product) {
        searchPage.productSearch(product);
    }

    @And("^Arama sonucunda çıkan ürünler sayfasında swipe yapılır$")
    public void aramaSonucundaÇıkanÜrünlerSayfasındaSwipeYapılır() {
        searchPage.searchSwipeUp();
    }

    @And("^Arama sonuçlarında ikinci sayfa açılır$")
    public void aramaSonuçlarındaİkinciSayfaAçılır() {
        searchPage.clickPageTwo();
    }

    @And("^Arama sonuçlarında ikinci sayfanın açıldığı kontrol edilir$")
    public void aramaSonuçlarındaİkinciSayfanınAçıldığıKontrolEdilir() {
        searchPage.checkPageTwoOpened();
    }

    @And("^Arama sonuçları arasından ratgele bir ürün seçilir$")
    public void aramaSonuçlarıArasındanRastgeleBirÜrünSeçilir() {
        searchPage.selectedProduct();
    }

}
