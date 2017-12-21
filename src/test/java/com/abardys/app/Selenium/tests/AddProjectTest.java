//package com.abardys.app.Selenium.tests;
//
//import com.abardys.app.Selenium.pages.HomePage;
//import com.abardys.app.Selenium.pages.ProjectRegisterPage1;
//import org.junit.Test;
//
//public class AddProjectTest extends BaseTest{
//
//    @Test
//    public void submitProject() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        Thread.sleep(8000);
//        ProjectRegisterPage1 projectRegisterPage1 = homePage.clickOnSubmitProjectButton();
//        ProjectRegisterPage1 refs = new ProjectRegisterPage1(driver);
//        projectRegisterPage1
//                .fillField(refs.fioFieldLoc, "Mark")
//                .fillField(refs.cityLoc, "London")
//                .fillField(refs.telLoc, "987654321")
//                .fillField(refs.mailLoc, "mark@gmail.com")
//                .fillField(refs.passLoc, "Mark2000")
//                .clickOnGoToStep2Btn();
////                .assertValidationMessage("Опишите свой проект так");
//        projectRegisterPage1.assertValidationMessage(projectRegisterPage1.toastText);
//
//    }
//}
