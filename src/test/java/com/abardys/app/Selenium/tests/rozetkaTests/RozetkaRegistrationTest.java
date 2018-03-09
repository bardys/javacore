package com.abardys.app.Selenium.tests.rozetkaTests;

import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaAbstractPage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaAccountPage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaHomePage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaRegisterPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaRegistrationTest extends RozetkaBaseTest {

    @Test
    public void  register() throws InterruptedException {

        RozetkaHomePage rozetkaHomePage = PageFactory.initElements(driver, RozetkaHomePage.class);
        RozetkaRegisterPage rozetkaRegisterPage = PageFactory.initElements(driver, RozetkaRegisterPage.class);
        RozetkaAccountPage rozetkaAccountPage = PageFactory.initElements(driver, RozetkaAccountPage.class);

        navigateTo(RozetkaAbstractPage.BASE_URL);
        rozetkaHomePage.openRegistrationForm();
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.nameField, "Mark Cook");
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.mailField, "markCook42@gmail.com");
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.passwordField, "Mark2000");
        rozetkaRegisterPage.clickOnSubmitBtn();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='personal_information']//h1")));

        rozetkaAccountPage.assertHeader("Личные данные");

//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        RozetkaRegisterPage rozetkaRegisterPage = rozetkaHomePage.openRegistrationForm();
//        RozetkaRegisterPage refs = new RozetkaRegisterPage(driver);
//        rozetkaRegisterPage
//                .fillField(refs.nameFieldLoc, "Mark Cook")
//                .fillField(refs.mailFieldLoc, "markCook1@gmail.com")
//                .fillField(refs.passwordFieldLoc, "Mark2000")
//                .clickOnSubmitBtn();

//        RozetkaAccountPage rozetkaAccountPage = new RozetkaAccountPage(driver);
//        rozetkaAccountPage.assertHeader("Личные данные");

//        Assert.assertEquals("Личные данные", rozetkaAccountPage.assertHeader());
    }
}
