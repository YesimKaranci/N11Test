package com.yesim.test.tests;

import com.yesim.test.contracts.IAddToBasketPage;
import com.yesim.test.page.AddToBasketPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class AddToBasketTest {
    public IAddToBasketPage addToBasketPage = new AddToBasketPage();

    @And("^Ürün sepete eklenir ve sepete gidilir ürün fiyatı seçilen ile aynı mı karşılaştırılır$")
    public void ürünSepeteEklenirVeSepeteGidilirÜrünFiyatıSeçilenİleAynıMıKarşılaştırılır() {
        addToBasketPage.addProductToBasket();
    }

    @And("^Adet arttırılarak ürün adedinin iki olduğu doğrulanır$")
    public void adetArttırılarakÜrünAdedininİkiOlduğuDoğrulanır() {
        addToBasketPage.numberOfProduct();
    }

}

}