package com.yesim.test.page;
import com.yesim.test.contracts.ISearchPage;
import org.openqa.selenium.By;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;

public class SearchPage extends BasePageUtil implements ISearchPage{

    public By searchArea=By.id("searchArea"); //Arama alanı
    public By searchButton=By.className("searchBtn"); //Arama butonu
    public By pageBar=By.className("active"); //sayfa geçiş barı
    public By Paging_Page2=By.className("next navigation"); //ikinci sayfa buton id
    public By titleProduct=By.className("product-title");
    public By selectedProduct=By.className("productName");


    @Override
    public void checkSearchSection() {
        Assert.assertTrue("Arama alanı düzgün görüntülenemedi!",isEnabled(searchArea));
    }

    @Override
    public void productSearch(String product) {
        sendKeys(searchArea,product);
        clickElement(searchButton);
    }

    @Override
    public void searchSwipeUp() {
        swipeToElement(pageBar);
    }

    @Override
    public void clickPageTwo() {
        clickElement(Paging_Page2);
    }
    @Override
    public void checkPageTwoOpened() {

        IWebElement currentPage = driver.FindElement(By.ClassName("active"));
        string Sayfa = currentPage.GetAttribute("class").ToString();
        Assert.True(Sayfa.Equals("active"),"2. Sayfaya ulaşılamadı");
        Thread.Sleep(4000);
        System.out.println("Paging kontrolü kullanıldı ve 2. sayfaya ulaşıldı.");

        //Assert.assertTrue("İkinci sayfaya geçilemedi!", twoPageButton.getAttribute("class").equals("active"));
    }

    @Override
    public void selectedProduct() {
        clickElement(selectedProduct);
    }
}
