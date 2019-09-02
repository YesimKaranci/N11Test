package com.yesim.test.page;

import com.yesim.test.contracts.IAddToBasketPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToBasketPage extends BasePageUtil implements IAddToBasketPage {
    public By product=By.className("productName bold"); //seçilen ürün
    public By productPrice=By.className("newPrice");
    public By addBasketButton=By.className("btn btnGrey btnAddBasket"); //sepete ekle butonu
    public By myBasket=By.className("myBasket"); //sepete gidilir

    @Override
    public void addProductToBasket() {

        IWebElement selectedProduct = driver.FindElement(By.ClassName("product"));
        IWebElement ClickItem = selectedProduct.FindElement(By.ClassName("productPrice"));
        var sepete_atilan_item = ClickItem.Text;
        ClickItem.Click();
        System.out.println("Ürün speete atıldı...");
        Thread.Sleep(5000);
        clickElement(myBasket);
        System.out.println("Sepet içerisine girildi...");

        IWebElement productDetail = driver.FindElement(By.ClassName("productPrice"));
        var price = productDetail.FindElement(By.TagName("2.299,99 TL"));

        Assert.That(price.Text, Is.EqualTo(sepete_atilan_item));
        System.out.println("Sepetteki ürün fiyatı ile seçilen ürün fiyatının aynı ürün olduğu doğrulandı...");
    }

    @Override
    public void numberOfProduct() {
        IWebElement increaseProduct = driver.FindElement(By.ClassName("spinnerUp spinnerArrow"));
        string adet = currentPage.GetAttribute("value").ToString();
        Assert.True(adet.Equals("2"),"2. Sayfaya ulaşılamadı");
    }
}
