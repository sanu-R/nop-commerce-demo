package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    /**Build your own computer Text, Processor Drop Down, Ram drop down,
     HDD radios, os radio, software check boxes, Add To Card button, "The product has been added to your shopping cart"
     message locators and it's actions*/
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwn;
    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement pro;
    @CacheLookup
    @FindBy(css = "#product_attribute_2")
    WebElement ramDropdown;
    @CacheLookup
    @FindBy(css = "#product_attribute_input_3")
    WebElement hdd;
  public void clickOnBuildYourOwnComputer(){
      clickOnElement(buildYourOwn);
  }
public void selectOnProcessor(String processor){
      selectByVisibleTextFromDropDown(pro,processor);
}

public void selectRam(String ram){
      selectByVisibleTextFromDropDown(ramDropdown,ram);

}









}
