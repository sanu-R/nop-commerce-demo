package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    /**Desktops text, Sortby, Display, selectProductList Locators and it's actions
    */
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsText;
    public void desktopLinkClick(){
        clickOnElement(desktops);
    }
   public String verifyTheDesktopsText(){
        return getTextFromElement(desktopsText);
   }











}










