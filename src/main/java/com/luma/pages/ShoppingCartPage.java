package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//span[@class='base']");
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By color = By.xpath("//dd[contains(text(),'Black')]");

    By overNightDuffleTextProduct = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    By QTYText = By.cssSelector(".input-text.qty");
    By productPrice =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    By QTY = By.cssSelector(".input-text.qty");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    By updateProductPrice =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public String getShoppingCart(){
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPant(){
        return getTextFromElement(cronusYogaPant);
    }
    public String getSize(){
        return getTextFromElement(size);
    }
    public String getColor(){
        return getTextFromElement(color);
    }

    public String getOverNightDuffle(){
        return getTextFromElement(overNightDuffleTextProduct);
    }

    public String getQTYText(){
        String q = driver.findElement(QTYText).getAttribute("value");
        return q;
    }

    public String getProductPrice(){
        return getTextFromElement(productPrice);
    }

    public void changeQTYOfOverNightDuffle(String newQTY){
        driver.findElement(QTY).clear();
        sendTextToElement(QTY,newQTY);

    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }



    public String getUpdateProductPrice() {
        return getTextFromElement(updateProductPrice);
    }




}
