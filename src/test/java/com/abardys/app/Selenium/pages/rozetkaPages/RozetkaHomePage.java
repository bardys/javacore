package com.abardys.app.Selenium.pages.rozetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaHomePage extends RozetkaAbstractPage{
//    By signinBtnLoc = By.name("signin");
//    By signupBtnLoc = By.linkText("Зарегистрироваться");


//    public RozetkaHomePage(WebDriver driver) {
//        super(driver, BASE_URL);
//    }

    @FindBy(name = "signin")
    public WebElement signinBtn;

    @FindBy(linkText = "Зарегистрироваться")
    public WebElement signupBtn;


    public void openRegistrationForm() {
        signinBtn.click();
        signupBtn.click();
//        return new RozetkaRegisterPage(driver);
    }
}
