package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPageTest registerPageTest;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPageTest = new RegisterPageTest();

    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() {
        //  Click on login link
        homePage.clickOnLoginLink();
        //	verify that "Welcome, Please Sign In!" message display
        softAssert.assertEquals(loginPage.verifyWelcomeMessage(),"Welcome, Please Sign In!","Text not found");



    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials() {
        //Click on login link
        homePage.clickOnLoginLink();
        //	 Enter EmailId
        loginPage.enterEmail("rao1234@gmail.com");
        //	 Enter Password
        loginPage.enterPassword("really1234");
        //	 Click on Login Button
        loginPage.clickOnLogin();
        //	 Verify that the Error message
        softAssert.assertEquals(loginPage.verifyErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }
@Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials (){
    // Click on login link
    homePage.clickOnLoginLink();
    //	 Enter EmailId
    loginPage.enterEmail("rao1234@gmail.com");
    //	 Enter Password
    loginPage.enterPassword("really123");
    //	 Click on Login Button
    loginPage.clickOnLogin();
    //  Verify that LogOut link is display



}
@Test
    public void  VerifyThatUserShouldLogOutSuccessFully(){
        // Click on login link
    homePage.clickOnLoginLink();
    //	 Enter EmailId
    loginPage.enterEmail("rao1234@gmail.com");
    //	 Enter Password
    loginPage.enterPassword("really123");
    //	 Click on Login Button
    loginPage.clickOnLogin();
    //	 Click on LogOut Link

    //	 Verify that LogIn Link Display
}








}
