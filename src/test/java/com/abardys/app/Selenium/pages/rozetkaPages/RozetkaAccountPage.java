package com.abardys.app.Selenium.pages.rozetkaPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaAccountPage extends RozetkaAbstractPage {

//    By headerTextLoc = By.xpath("//div[@id='personal_information']//h1");

    @FindBy(xpath = "//div[@id='personal_information']//h1")
    WebElement headerText;


//    public RozetkaAccountPage(WebDriver driver){
//        super(driver);
//    }

    public void assertHeader(String alertText) {
//        WebElement headerText = driver.findElement(headerTextLoc);
        String title = headerText.getText();
        Assert.assertEquals(alertText, title);
//        System.out.println(headerText.getText());
//        Assert.assertTrue(title.equals("Личные данные"));

    }

}
