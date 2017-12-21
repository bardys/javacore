//package com.abardys.app.Selenium;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class EquerestTests {
//
//    WebDriver driver;
//    By submitProjectBtnLoc = By.xpath("//*[@id='banner']//a[1]");
//    By fioFieldLoc = By.id("fio");
//    By cityLoc = By.id("city");
//    By telLoc = By.id("tel");
//    By mailLoc = By.id("mail");
//    By passLoc = By.id("pass");
//    By goToStep2BtnLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[6]/button");
//    By projectNameLoc = By.id("title");
//    By projectDescLoc = By.id("full_description");
//    By ideaRadioBtnLoc = By.xpath("//input[@id='radio_0']/following-sibling::label");
//    By advantagesLoc = By.id("advantages");
//    By monetizationLoc = By.id("monetization_model");
//    By amountLoc = By.id("required_amount");
//    By agreeLoc = By.xpath("//label[@for='checkbox_agree']");
//    By completeRegistrationLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[8]/button");
//    By thanksLoc = By.xpath(".//*[@id='thankYouMessage']/div[1]/p[1]");
//    By step2TextLoc = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/div");
//
//    @Before
//    public void setUp(){
//        driver = new FirefoxDriver();
//        driver.get("https://dev.equerest.com/");
//    }
//
//    @Test
//    public void submitProject() throws InterruptedException {
//        WebElement submitProjectBtn = driver.findElement(submitProjectBtnLoc);
//        submitProjectBtn.click();
//        WebElement fioField = driver.findElement(fioFieldLoc);
//        fioField.sendKeys("Barak Obama");
//        WebElement city = driver.findElement(cityLoc);
//        city.sendKeys("Washington");
//        WebElement tel = driver.findElement(telLoc);
//        tel.sendKeys("987654321");
//        WebElement mail = driver.findElement(mailLoc);
//        mail.sendKeys("obama@gmail.com");
//        WebElement pass = driver.findElement(passLoc);
//        pass.sendKeys("Obama2000");
//        WebElement goToStep2Btn = driver.findElement(goToStep2BtnLoc);
//        goToStep2Btn.click();
////        WebElement projectName = driver.findElement(projectNameLoc);
////        projectName.sendKeys("newProject");
////        WebElement projectDesc = driver.findElement(projectDescLoc);
////        projectDesc.sendKeys("projectDesc");
////        WebElement ideaRadioBtn = driver.findElement(ideaRadioBtnLoc);
////        ideaRadioBtn.click();
////        WebElement advantages = driver.findElement(advantagesLoc);
////        advantages.sendKeys("projectAdvantages");
////        WebElement monetization = driver.findElement(monetizationLoc);
////        monetization.sendKeys("projectMonetization");
////        WebElement amount = driver.findElement(amountLoc);
////        amount.sendKeys("2000");
////        WebElement agree = driver.findElement(agreeLoc);
////        agree.click();
////        WebElement completeRegistration = driver.findElement(completeRegistrationLoc);
////        completeRegistration.click();
////
////        WebElement thanks = driver.findElement(thanksLoc);
////        Assert.assertTrue(thanks.getText().contentEquals("Спасибо!"));
//
//        WebElement step2Text = driver.findElement(step2TextLoc);
//        Assert.assertTrue(step2Text.getText().contains("Опишите свой проект так"));
//
//
//        Thread.sleep(8000);
//    }
//
//    @After
//    public void tearDown(){
//        driver.close();
//    }
//}
