package com.abardys.app.Selenium.tests.pageFactoryTests;

import com.abardys.app.Selenium.pages.pageFactoryPages.GoogleSRPage;
import com.abardys.app.Selenium.tests.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class GoogleSRPageTest extends BaseTest{



    @Ignore
    @Test
    public void searchForQ(){
        driver.get("http://www.google.com");
        GoogleSRPage page = PageFactory.initElements(driver, GoogleSRPage.class);
        page.searchFor("Cheese");
    }


}
