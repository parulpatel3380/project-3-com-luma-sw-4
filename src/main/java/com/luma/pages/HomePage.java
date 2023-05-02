package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By topMenu =By.xpath("//a[@id='ui-id-9']");
    By jacket =By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu =By.xpath("//a[@id='ui-id-5']");
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bags = By.xpath("//span[normalize-space()='Bags']");





    public void mouseHoverToElementToWomenMenu(){
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverToElementToTopMenu(){
        mouseHoverToElement(topMenu);
    }

    public void clickOnJacket(){
        clickOnElement(jacket);
    }


    public void mouseHoverToElementToMenMenu(){
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToElementBottomsMenu(){
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants(){
        clickOnElement(pants);
    }

    public void mouseHoverToGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags() {
        clickOnElement(bags);

    }
}
