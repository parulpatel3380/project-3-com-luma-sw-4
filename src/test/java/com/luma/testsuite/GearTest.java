package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle_Page;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage= new HomePage();

    GearPage gearPage= new GearPage();
    OverNightDuffle_Page overNightDufflePage = new OverNightDuffle_Page();

    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {
        homePage.mouseHoverToGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnProductGear();

        Assert.assertEquals(overNightDufflePage.getTextOvernightDuffle(), "Overnight Duffle");
        overNightDufflePage.changeQTY("3");
        overNightDufflePage.clickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getAddToCart(), "You added Overnight Duffle to your shopping cart.");
        overNightDufflePage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffle(), "Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQTYText(), "3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        shoppingCartPage.changeQTYOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdateProductPrice(), "$225.00");


    }



}
