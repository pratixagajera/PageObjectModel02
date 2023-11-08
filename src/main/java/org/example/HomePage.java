package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends Utils
{
//    method created for click on submit button
    public void clickOnSearchButton()
    {
        waitForClickAble(By.xpath("//button[@class = \"button-1 search-box-button\"]"), 10);
        clickOnElement(By.xpath("//button[@class = \"button-1 search-box-button\"]"));
    }

    /*create method for get text from element*/
    public void toAcceptAndGetText()
    {
        String alertMessage = driver.switchTo().alert().getText(); /*to get text from alert*/
        System.out.println(alertMessage);
        driver.switchTo().alert().accept();  /*to click on ok button*/
    }

    /*create method for lick on vote button*/
    public void clickOnVoteButton()
    {
        waitForClickAble(By.xpath("//button[@class =\"button-2 vote-poll-button\"]"), 10);
        clickOnElement(By.xpath("//button[@class =\"button-2 vote-poll-button\"]"));
    }

   /*create method to get text from vote button*/
    public void toGetTextFromVoteAlert()
    {
        String voteAlertMessage= driver.switchTo().alert().getText();
        System.out.println(voteAlertMessage);
        driver.switchTo().alert().accept();
        Assert.assertEquals(voteAlertMessage,"please select an answer","No such Message");
    }

    /*create method for currency option*/
    public void toChooseCurrencyOption()
    {
        waitForClickAble(By.xpath("//select[@id = \"customerCurrency\"]"), 10);
        selectFromDropDown(By.xpath("//select[@id = \"customerCurrency\"]"),  "US Dollar");
    }

    /*create method to get all product price list*/
    public void getAllProductPriceLists()
    {
        List<WebElement> products = driver.findElements(By.xpath("//div[@class = \"prices\"]"));
        System.out.println(products.size());
        List<String>productPriceList = new ArrayList<>();
        for (WebElement ele:products)
        {
            productPriceList.add(ele.getText());
            System.out.println(ele.getText());
        }
    }

    /*create method to click details button*/
    public void clickOnDetailsButton()
    {
        clickOnElement(By.xpath("//div[@class = \"news-item\"][2]/div[3]/a[1]"));
    }

    /*create method to click on place holder search  bar*/
    public void clickOnPlaceHolder()
    {
        waitForClickAble(By.xpath("//button[@class = \"button-1 search-box-button\"]"), 10);
        typeText(By.xpath("//input[@class = \"search-box-text ui-autocomplete-input\"]"), "Apple");
        clickOnElement(By.xpath("//button[@class = \"button-1 search-box-button\"]"));
    }

    /*create method to click on register button*/
    public void clickOnRegisterButton()
    {
        clickOnElement(By.xpath("//a[@class = \"ico-register\"]"));
    }

    /*create method to click on log in button*/
    public void clickOnLogInButton()
    {
        clickOnElement(By.xpath("//a[@class = \"ico-login\"]"));
    }

    /*method for click on apple macBook product*/
    public void clickOnAppleMacBookProduct()
    {
        clickOnElement(By.linkText("Apple MacBook Pro 13-inch"));
    }
}
