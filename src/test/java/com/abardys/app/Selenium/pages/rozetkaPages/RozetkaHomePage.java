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

    @FindBy(xpath = "//a[text()=' увійдіть в особистий кабінет ']")
    public WebElement signinBtn;

    @FindBy(xpath = "//a[text()='Зареєструватися']")
    public WebElement signupBtn;


    public void openRegistrationForm() {
        signinBtn.click();
        signupBtn.click();
//        return new RozetkaRegisterPage(driver);
    }
}
