package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AppleMacBookProductPage extends Utils
{
    /*method created for purchase product*/
    public void purchaseProcess()
    {
        /*click on add to cart button*/
        clickOnElement(By.xpath("//button[@id = \"add-to-cart-button-4\"]"));
        /*click on shopping cart button*/
        clickOnElement(By.xpath("//span[@class = \"cart-label\"]"));
        /*click on checkbox for terms and conditions apply*/
        clickOnElement(By.xpath("//input[@id = \"termsofservice\"]"));
        /*click on checkout button*/
        clickOnElement(By.xpath("//button[@id = \"checkout\"]"));
        /*select country from drop down*/
        Select selectCountry = new Select(driver.findElement(By.name("BillingNewAddress.CountryId")));
        selectCountry.selectByVisibleText("United States");
        /*select state from drop down*/
        Select selectState = new Select(driver.findElement(By.name("BillingNewAddress.StateProvinceId")));
        selectState.selectByVisibleText("Alaska");
        /*type billing address city name*/
        typeText(By.xpath("//input[@id = \"BillingNewAddress_City\"]"), "snow world");
        /*type billing address*/
        typeText(By.xpath("//input[@id = \"BillingNewAddress_Address1\"]"), "104, thor park");
        /*type zip code of billing address*/
        typeText(By.xpath("//input[@id = \"BillingNewAddress_ZipPostalCode\"]"), "kip097");
        /*type phone number*/
        typeText(By.xpath("//input[@id = \"BillingNewAddress_PhoneNumber\"]"), "986546384374");
        /*click on continue button*/
        clickOnElement(By.xpath("//div[@id = \"billing-buttons-container\"]/button[4]"));
        /*click on radio button to select shipping by air */
        clickOnElement(By.xpath("//input[@id = \"shippingoption_1\"]"));
        /*click on continue button*/
        clickOnElement(By.xpath("//button[@class = \"button-1 shipping-method-next-step-button\"]"));
        /*click on radio button for credit card*/
        clickOnElement(By.xpath("//input[@id = \"paymentmethod_1\"]"));
        /*click on continue button*/
        clickOnElement(By.xpath("//button[@class = \"button-1 payment-method-next-step-button\"]"));
        /*select card type from drop down*/
        Select selectCardType = new Select(driver.findElement(By.name("CreditCardType")));
        selectCardType.selectByVisibleText("Master card");
        /*type card holder name*/
        typeText(By.xpath("//input[@id = \"CardholderName\"]"), "Sanya Sharma");
        /*type card number*/
        typeText(By.xpath("//input[@id = \"CardNumber\"]"), "8820 5306 4633 7460");
        /*select expire date from drop down*/
        Select selectMonth = new Select(driver.findElement(By.name("ExpireMonth")));
        selectMonth.selectByIndex(5);
        /*select expire year from drop down*/
        Select selectYear = new Select(driver.findElement(By.name("ExpireYear")));
        selectYear.selectByValue("2025");
        /*type card code*/
        typeText(By.xpath("//input[@id = \"CardCode\"]"), "870");
        /*click on continue button*/
        clickOnElement(By.xpath("//button[@class = \"button-1 payment-info-next-step-button\"]"));
    }
}
