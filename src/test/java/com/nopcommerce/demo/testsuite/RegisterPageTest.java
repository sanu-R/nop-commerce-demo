package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends BaseTest {
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //Click on Register Link
        registerPage.clickOnRegister();
        //   Verify "Register" text
        softAssert.assertEquals(registerPage.checkRegister(), "Register", "text not displayed");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        //Click on Register Link
        registerPage.clickOnRegister();
        //   Click on "REGISTER" button
        registerPage.EnterOnRegisterButton();

        //   Verify the error message "First name is required."
        softAssert.assertEquals(registerPage.verifyTheErrorMessage("First name is required."), "First name is required.", "Text not found");

        //   Verify the error message "Last name is required."
        softAssert.assertEquals(registerPage.verifyTheErrorMessage("Last name is required."), "Last name is required.", "Text not found");
        //   Verify the error message "Email is required."
        softAssert.assertEquals(registerPage.verifyTheErrorMessage("Email is required."), "Email is required.", "Text not found");

        //   Verify the error message "Password is required."
        softAssert.assertEquals(registerPage.verifyTheErrorMessage("Password is required."), "Password is required.", "Text not found");

        //   Verify the error message "Password is required."
        softAssert.assertEquals(registerPage.verifyTheErrorMessage("Password is required."), "Password is required.", "Text not found");

    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        // Click on Register Link
        registerPage.clickOnRegister();
        Thread.sleep(2000);
        //   Select gender "Female"
        registerPage.clickOnRadioGender("Female");
        Thread.sleep(2000);
        //   Enter firstname
        registerPage.enterYourDetails("Rima");
        Thread.sleep(2000);
        //   Enter lastname
        registerPage.enterLastNameInField("Smith");
        Thread.sleep(2000);
        //   Select day
        //   Select month
        //   Select year
        registerPage.enterBirthDetails(5,"August","1999");
        Thread.sleep(2000);
        //   Enter email
        registerPage.enterYourEmailToEmailField("rao123@gmail.com");
        Thread.sleep(2000);
        //   Enter password
        registerPage.writeYourPassword("really123");
        Thread.sleep(2000);
        //   Enter Confirm Password
        registerPage.rewriteYourPasswordToPasswordField("really123");
        Thread.sleep(2000);
        //   Click on "REGISTER" button
        registerPage.pressLastRegisterField();
        Thread.sleep(2000);
        //   Verify message "Your registration completed"
       softAssert.assertEquals(registerPage,"Your registration completed","Text not found");
    }


}
