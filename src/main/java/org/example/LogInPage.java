package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils
{
    /*method created to login successful*/
    public void userShouldLogIn()
    {
        /*type email*/
        typeText(By.xpath("//input[@class = \"email\"]"),email01);
        /*type password*/
        typeText(By.xpath("//input[@class = \"password\"]"), password);
        /*click on log in button*/
        clickOnElement(By.xpath("//button[@class = \"button-1 login-button\"]"));
    }
}
