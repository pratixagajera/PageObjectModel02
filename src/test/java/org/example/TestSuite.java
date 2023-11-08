package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    /*object created for homepage*/
    HomePage homePage = new HomePage();
    /*object created for newReleaseForComments page*/
    NewReleaseForComments newReleaseForComments = new NewReleaseForComments();
    /*object created for searchProductWithBrandName page*/
    SearchProductWithBrandName searchProductWithBrandName = new SearchProductWithBrandName();
    /*objected created for register page*/
    RegisterPage registerPage = new RegisterPage();
    /*objected created for registerResult page*/
    RegisterResultPage registerResultPage = new RegisterResultPage();
    /*objected created for logInPage page*/
    LogInPage logInPage = new LogInPage();
    /*objected created for appleMacBookProductPage*/
    AppleMacBookProductPage appleMacBookProductPage = new AppleMacBookProductPage();

    /*create method for alert*/
    @Test
    public void userShouldGetTextFromAlert()
    {
        /*click on submit button*/
        homePage.clickOnSearchButton();
        /*click on ok button and get text from alert*/
        homePage.toAcceptAndGetText();
    }

    /*create method for alert to vote button*/
    @Test
    public void userShouldTextFromAlertForVoteButton()
    {
        /*click on vote button*/
        homePage.clickOnVoteButton();
        /*click on ok button and get text from alert*/
        homePage.toGetTextFromVoteAlert();
    }

    /*create method for select currency option*/
    @Test
    public void userShouldSelectCurrencyOptionFromDropDown()
    {
        homePage.toChooseCurrencyOption();
        homePage.getAllProductPriceLists();
    }

   /*create method for user can write comment and send*/
    @Test
    public void userCanWriteAndSendComment()
    {
        homePage.clickOnDetailsButton();
        newReleaseForComments.userShouldWriteComments();
    }

    /*create method for user should see products with brand name*/
    @Test
    public void userShouldSeeAllProductsWithBrand()
    {
        /*type brand name and search*/
        homePage.clickOnPlaceHolder();
//        searchProductWithBrandName.userCanSeeAllProductsWthBrandName();
        searchProductWithBrandName.getAllProductsName();
    }


    /*create method user can purchase product successfully*/
    @Test
    public void userShouPurchaseProductSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerPage.userShouldRegister();
        registerResultPage.verifyUserRegisteredSuccessfully();
        homePage.clickOnLogInButton();
        logInPage.userShouldLogIn();
        homePage.clickOnAppleMacBookProduct();
        appleMacBookProductPage.purchaseProcess();
    }
}
