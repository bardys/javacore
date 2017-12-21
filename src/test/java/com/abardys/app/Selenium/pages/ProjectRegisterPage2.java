package com.abardys.app.Selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectRegisterPage2 extends AbstractPage{

    By projectNameLoc = By.id("title");
    By projectDescLoc = By.id("full_description");
    By ideaRadioBtnLoc = By.xpath("//input[@id='radio_0']/following-sibling::label");
    By advantagesLoc = By.id("advantages");
    By monetizationLoc = By.id("monetization_model");
    By amountLoc = By.id("required_amount");
    By agreeLoc = By.xpath("//label[@for='checkbox_agree']");
    By completeRegistrationLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[8]/button");
    By thanksLoc = By.xpath(".//*[@id='thankYouMessage']/div[1]/p[1]");
    By step2TextLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/div");

    public ProjectRegisterPage2(WebDriver driver){
        super(driver);
    }

    public void assertValidationMessage(String message) {
        WebElement step2Text = driver.findElement(step2TextLoc);
        Assert.assertTrue(step2Text.getText().contains(message));
    }




}
