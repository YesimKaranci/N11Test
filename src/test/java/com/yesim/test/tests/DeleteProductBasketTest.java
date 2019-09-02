package com.yesim.test.tests;

import com.yesim.test.contracts.IAddToBasketPage;
import com.yesim.test.page.AddToBasketPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AddToBasketTest {
    public IDeleteProductBasketPage deleteProductBasketPage = new DeleteProductBasketPage();

    @And("^Ürün sepetten silinir$")
    public void ürünSepettenSilinir() {
        deleteProductBasketPage.clickDeleteButton();
    }

    @And("^Sepetin boş olduğu kontrol edilir$")
    public void sepetinBoşOlduğuKontrolEdilir() {
        deleteProductBasketPage.checkEmptyBasket();
    }
}