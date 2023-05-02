package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.Women_Jackets_Page;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Women_Jackets_Test extends BaseTest {
    HomePage homePage = new HomePage();
    Women_Jackets_Page womenPage = new Women_Jackets_Page();

    @Test
    public void verifyTheSortByProductNameFilter(){

        homePage.mouseHoverToElementToWomenMenu();
        homePage.mouseHoverToElementToTopMenu();
        homePage.clickOnJacket();
        womenPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenPage.getProductsDisplay1(),womenPage.getProductsDisplay2());
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        homePage.mouseHoverToElementToWomenMenu();
        homePage.mouseHoverToElementToTopMenu();
        homePage.clickOnJacket();
        womenPage.selectProductNameFilter("Price");
        Assert.assertEquals(womenPage.getProductsPriceDisplay1(),womenPage.getProductsPriceDisplay2());
    }


}
