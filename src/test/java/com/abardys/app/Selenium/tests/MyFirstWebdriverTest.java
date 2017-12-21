package com.abardys.app.Selenium.tests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class MyFirstWebdriverTest {

    By searchField = By.name("q");

    @Ignore
    @Test
    public void myFirstWebdriverTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        WebElement searchInput = driver.findElement(searchField);
        searchInput.sendKeys("Monkey");
        searchInput.submit();
        Thread.sleep(8000);
        List<WebElement> linkList = driver.findElements(By.xpath("//*[@class='r']//a"));
        System.out.println(linkList.size());
        Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));



        Thread.sleep(10000);
        driver.close();
}
}
