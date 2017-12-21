package com.abardys.app.Selenium.pages.pageFactoryPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSRPage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    public void searchFor(String text){
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
