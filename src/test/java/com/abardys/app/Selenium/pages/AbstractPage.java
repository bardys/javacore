package com.abardys.app.Selenium.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    public static final String BASE_URL= "https://dev.equerest.com/";
    WebDriver driver;

    public AbstractPage(WebDriver driver, String url) throws InterruptedException {
        this.driver = driver;
        driver.navigate().to(url);
        Thread.sleep(8000);

    }

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
