package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchProductWithBrandName extends Utils
{
    /*method created to get  product list*/
    public void getAllProductsName()
    {
        List<WebElement> products = driver.findElements(By.xpath("//h2[@class = \"product-title\"]"));
        System.out.println(products.size());
        /*create object*/
        List<String>productNameList = new ArrayList<>();
       /*for each use to get list of product name*/
        for (WebElement ele:products)
        {
            productNameList.add(ele.getText());
            System.out.println(ele.getText());
        }
    }
}
