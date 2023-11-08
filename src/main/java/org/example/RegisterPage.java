package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils
{
    /*create method for registration*/
    public void userShouldRegister()
    {
        /*click on register button*/
        clickOnElement(By.xpath("//input[@id = \"gender-male\"]"));
        /*type first name field*/
        typeText(By.xpath("//input[@id = \"FirstName\"]"), "Kush");
        /*type last name field*/
        typeText(By.xpath("//input[@id = \"LastName\"]"), "Patel");
        /*select date of birth from drop down*/
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("10");
        /*select date of month from drop down*/
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByIndex(9);
        /*select year of birth from drop down*/
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1999");
        /*type email field*/
        typeText(By.id("Email"), email01);
        /*type company name field*/
        typeText(By.id("Company"), "Swara");
        /*type password*/
        typeText(By.name("Password"), password);
        /*type confirmation password*/
        typeText(By.id("ConfirmPassword"),password);
        /*click on register button*/
        clickOnElement(By.name("register-button"));
    }
}
