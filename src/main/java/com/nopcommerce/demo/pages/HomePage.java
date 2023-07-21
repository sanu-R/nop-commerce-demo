package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    /**All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
     and create appropriate methods for it*/
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']")
    List<WebElement>  topMenuList;
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
public void clickOnMenuTab(String allMenu){
        for(WebElement menu:topMenuList){
            if(menu.getText().contains(allMenu)){
                clickOnElement(menu);
            }
        }
}

}
