package com.abardys.app.Selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectRegisterPage1 extends AbstractPage{

    public static final String URL = BASE_URL + "register#/entrepreneur";

    public By fioFieldLoc = By.id("fio");
    public By cityLoc = By.id("city");
    public By telLoc = By.id("tel");
    public By mailLoc = By.id("mail");
    public By passLoc = By.id("pass");
    public By goToStep2BtnLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[6]/button");
    public By toastMessage = By.xpath("//*[@class='toast-message']");
    public final String toastText = "Пользователь с таким e-mail уже зарегестрирован.";



    public ProjectRegisterPage1(WebDriver driver){
        super(driver);
    }



    public ProjectRegisterPage1 fillField(By locator, String text) {
        WebElement webElement = driver.findElement(locator);
        webElement.clear();
        webElement.sendKeys(text);
        //Assert.assertEquals(text, driver.findElement(locator).getText());
        return this;
    }

    public ProjectRegisterPage2 clickOnGoToStep2Btn() {
        driver.findElement(goToStep2BtnLoc).click();
        return new ProjectRegisterPage2(driver);
    }

    public void assertValidationMessage(String alertText){
        WebElement em = driver.findElement(toastMessage);
        String actualEm = em.getAttribute("aria-label");
        Assert.assertEquals(alertText, actualEm);
    }

}
