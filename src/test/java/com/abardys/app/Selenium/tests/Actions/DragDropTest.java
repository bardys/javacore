package com.abardys.app.Selenium.tests.Actions;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

public class  DragDropTest {
    WebDriver driver;
    By fromLoc = By.id("one");
    By toLoc = By.id("bin");


    @Ignore
    @Test
    public void myDragDropTest() throws AWTException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://html5demos.com/drag/#");
//        driver.switchTo().frame("iframeResult");

        WebElement from = driver.findElement(fromLoc);
        WebElement to = driver.findElement(toLoc);

        Actions builder = new Actions(driver);
//        builder.dragAndDrop(from, to).build().perform();
        builder.clickAndHold(from).moveToElement(to).release(to).build().perform();

//        Robot robot = new Robot();
//        robot.setAutoDelay(500);
//        robot.mouseMove(from.getRect().getPoint().getX(), from.getRect().getPoint().getY());
//        robot.mousePress(InputEvent.BUTTON1_MASK);
    }
}
