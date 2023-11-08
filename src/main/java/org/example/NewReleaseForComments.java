package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewReleaseForComments extends Utils
{
    public void userShouldWriteComments()
    {
        /*wait until comment button clickable*/
        waitForClickAble(By.xpath("//button[@class = \"button-1 news-item-add-comment-button\"]"), 10);
        /*get text from element for title of page*/
        String message = getTextFromElement(By.xpath("//div[@class = \"page-title\"]/h1"));
        System.out.println(message);
        /*assert point to get confirmation*/
        Assert.assertEquals(message, "nopCommerce new release!", "nopCommerce comments");
        /*type text to enter title for comment*/
        typeText(By.xpath("//input[@id = \"AddNewComment_CommentTitle\"]"), title);
        /*type description for comment*/
        typeText(By.xpath("//textarea[@id = \"AddNewComment_CommentText\"]"), description);
        /*click on new comment button*/
        clickOnElement(By.xpath("//button[@class = \"button-1 news-item-add-comment-button\"]"));
        /*get text from element to get text for confirmation message*/
        String successfulMessage = getTextFromElement(By.xpath("//div[@class = \"result\"]"));
        System.out.println(successfulMessage);
        Assert.assertEquals(successfulMessage, "News comment is successfully added.", "New comments are not added sucessfully");
    }
}
