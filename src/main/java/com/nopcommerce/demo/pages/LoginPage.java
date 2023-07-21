package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    /**
     * Email, password, Login Button and "Welcome, Please Sign In!" text Locators
     * and create appropriate methods for it.
     */
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement eMail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWord;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String verifyWelcomeMessage() {
        return getTextFromElement(verifyWelcomeText);

    }

    public void enterEmail(String email) {
        sendTextToElement(eMail, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passWord, password);
    }

    public void clickOnLogin() {
        clickOnElement(login);
    }

    public String verifyErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
