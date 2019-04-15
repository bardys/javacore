package com.abardys.app.Selenium.bdd.steps;

import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaAbstractPage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaAccountPage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaHomePage;
import com.abardys.app.Selenium.pages.rozetkaPages.RozetkaRegisterPage;
import com.abardys.app.Selenium.tests.BaseTest;
import com.abardys.app.Selenium.tests.rozetkaTests.RozetkaBaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefs extends RozetkaBaseTest{


    RozetkaHomePage rozetkaHomePage = PageFactory.initElements(driver, RozetkaHomePage.class);
    RozetkaRegisterPage rozetkaRegisterPage = PageFactory.initElements(driver, RozetkaRegisterPage.class);
    RozetkaAccountPage rozetkaAccountPage = PageFactory.initElements(driver, RozetkaAccountPage.class);

    @Given("^I am on main page$")
    public void iAmOnMainPage() {
        setUp();
        driver.navigate().to("https://rozetka.com.ua/");

    }

    @When("^I open Registration form$")
    public void iOpenRegistrationForm(){
        rozetkaHomePage.openRegistrationForm();
    }

    @And("^I fill my Name \"([^\"]*)\" into Name field$")
    public void iFillMyNameIntoNameField(String name) {
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.nameField, name);
    }


    @And("^I fill my email address \"([^\"]*)\" into Email field$")
    public void iFillMyEmailAddressIntoEmailField(String email) {
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.mailField, email);
    }

    @And("^I fill my desired password \"([^\"]*)\" into Password field$")
    public void iFillMyDesiredPasswordIntoPasswordField(String password) {
        rozetkaRegisterPage.fillField(rozetkaRegisterPage.passwordField, password);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        rozetkaRegisterPage.clickOnSubmitBtn();
    }

    @Then("^I should see page with \"([^\"]*)\" title$")
    public void iShouldSeePageWithTitle(String title){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='personal_information']//h1")));

        rozetkaAccountPage.assertHeader(title);
        driver.quit();
    }




}
