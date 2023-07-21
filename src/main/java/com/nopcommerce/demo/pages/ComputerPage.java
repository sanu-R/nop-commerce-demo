package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    /**
     * Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
     * and create appropriate methods for it.
     */
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Computers']")
    WebElement computerText;


    public String verifyComputerText() {
        return getTextFromElement(computerText);
    }











}