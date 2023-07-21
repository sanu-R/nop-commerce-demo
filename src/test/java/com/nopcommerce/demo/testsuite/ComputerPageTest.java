package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.testdata.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPageTest registerPageTest;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPageTest = new RegisterPageTest();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //Click on Computer tab
        homePage.clickOnMenuTab("Computer");
        //   Verify "Computer" text
        softAssert.assertEquals(computerPage.verifyComputerText(),"Computers ","Text not found");


    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Click on Computer tab
        homePage.clickOnMenuTab("Computer");
        //   Click on Desktops link
     desktopsPage.desktopLinkClick();
        //   Verify "Desktops" text
        softAssert.assertEquals(desktopsPage.verifyTheDesktopsText()," Desktops "," Desktops text not found");



    }

    @Test(dataProvider = "component", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software) {


        //Click on Computer tab
        homePage.clickOnMenuTab("Computer");
        //   Click on Desktops link
        desktopsPage.desktopLinkClick();
        //   Click on product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
        //   Select processor "processor"
        buildYourOwnComputerPage.selectOnProcessor(processor);
        //   Select RAM "ram"
        buildYourOwnComputerPage.selectRam(ram);
        //   Select HDD "hdd"

        //   Select OS "os"
        //   Select Software "software"
        //   Click on "ADD TO CART" Button
        //   Verify message "The product has been added to your shopping cart"


    }


}
