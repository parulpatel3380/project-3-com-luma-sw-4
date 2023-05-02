package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDuffle_Page extends Utility {
    By overnightDuffleText = By.xpath("//span[@class='base']");

    By QTY = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public String getTextOvernightDuffle() {
        return getTextFromElement(overnightDuffleText);
    }

    public void changeQTY(String updateQTY) {
        driver.findElement(QTY).clear();
        sendTextToElement(QTY,updateQTY);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddToCart() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

}
