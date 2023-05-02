package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.Men_Page;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    Men_Page menPage = new Men_Page();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){
        homePage.mouseHoverToElementToMenMenu();
        homePage.mouseHoverToElementBottomsMenu();
        homePage.clickOnPants();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnBlackColor();
        menPage.clickOnAddCart();
        Assert.assertEquals(menPage.getTextAfterAddtoCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getShoppingCart(),"Shopping Cart");
        Assert.assertEquals(shoppingCartPage.getCronusYogaPant(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.getSize(),"32");
        Assert.assertEquals(shoppingCartPage.getColor(),"Black");
        //  Assert.assertEquals(shoppingCartPage.getSize(),"32");










}

}
