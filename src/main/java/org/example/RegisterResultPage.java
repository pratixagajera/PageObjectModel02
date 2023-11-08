package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    /*create method to verify confirmation email for registration*/
    public void verifyUserRegisteredSuccessfully()
    {
        /*get text from element for confirmation result*/
        String registrationMessage = getTextFromElement(By.className("result"));
        System.out.println(registrationMessage);
        /*assert point*/
        Assert.assertEquals(registrationMessage, "Your registration completed", "Your registration is not completed");
    }
}
