package com.abardys.app.Selenium.pages.rozetkaPages;

import com.abardys.app.Selenium.tests.rozetkaTests.RozetkaBaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaRegisterPage extends RozetkaAbstractPage{

//    public By nameFieldLoc = By.name("title");
//    public By mailFieldLoc = By.name("login");
//    public By passwordFieldLoc = By.name("password");
//    public By submitBtnLoc = By.xpath("//button[@type='submit' and text()='Зарегистрироваться']");

    @FindBy(name = "title")
    public WebElement nameField;

    @FindBy(name = "login")
    public WebElement mailField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and text()='Зарегистрироваться']")
    public WebElement submitBtn;


//    public RozetkaRegisterPage(WebDriver driver){
//        super(driver);
//    }

    public void fillField(WebElement webElement, String text) {
//        WebElement webElement = driver.findElement(locator);
        webElement.clear();
        webElement.sendKeys(text);
//        Assert.assertEquals(text, webElement.getText());
//        return this;
    }



    public void clickOnSubmitBtn() {
        submitBtn.click();

//        Thread.sleep(5000);
//        return new RozetkaAccountPage(driver);
    }

}