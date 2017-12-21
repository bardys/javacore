package com.abardys.app.Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage{

    By submitProjectBtnLoc = By.xpath("//*[@id='banner']//a[1]");

    public HomePage(WebDriver driver) throws InterruptedException {
        super(driver, BASE_URL);
    }

    public ProjectRegisterPage1 clickOnSubmitProjectButton() {
        driver.findElement(submitProjectBtnLoc).click();
        return new ProjectRegisterPage1(driver);
    }
}
