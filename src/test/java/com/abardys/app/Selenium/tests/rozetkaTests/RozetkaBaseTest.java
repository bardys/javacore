package com.abardys.app.Selenium.tests.rozetkaTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class RozetkaBaseTest {

//    public RozetkaBaseTest(){
//        setUp();
//    }
    public WebDriver driver;
    private static final String BROWSER = System.getProperty("browser");
    private static String REMOTE = System.getProperty("remote");
    private static String REMOTE_URL = "http://localhost:4444/wd/hub";
    private static final String OS = System.getProperty("os.name").toLowerCase();
    DesiredCapabilities capabilities = new DesiredCapabilities();

    private static final String CHROME_PATH_MAC = "src\\test\\java\\resources\\drivers\\chromedriver\\chromedriver";
    private static final String CHROME_PATH_WIN = "src\\test\\java\\resources\\drivers\\chromedriver\\chromedriver.exe";


//    @Rule
//    public TestWatcher screenshotOnFail = new TestWatcher() {
//        @Override
//        protected void failed(Throwable e, Description description) {
//            saveImageAttach("Screenshot on failure");
//        }
//
//        @Override
//        protected void finished(Description description){
//            driver.quit();
//        }
//    };




    @Before
    public void setUp(){
        if (BROWSER == null || BROWSER.equalsIgnoreCase("Firefox") || BROWSER.equalsIgnoreCase("")){
            this.driver = new FirefoxDriver();
            capabilities.setBrowserName("firefox");
        }else if (BROWSER.equalsIgnoreCase("Chrome")) {
            if (isWindows()){
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_WIN);
            }else if (isMac()){
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_MAC);
            }
            capabilities.setBrowserName("chrome");
            this.driver = new ChromeDriver();
        }

        if(REMOTE !=null && REMOTE.equalsIgnoreCase("true")) {
            try {
                this.driver = new RemoteWebDriver(new URL(REMOTE_URL), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        //moved to TestWatcher
        saveImageAttach("screenshot from " + BROWSER);
        driver.quit();
    }


    @Attachment(value = "{0}", type = "image/png")
    public byte[] saveImageAttach(String attachName) {
        try {
            File srcFile =
                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            return toByteArray(srcFile);
        } catch (Exception e) { e.printStackTrace(); }
        return new byte[0];
    }

    private static byte[] toByteArray(File file) throws IOException {
        return Files.readAllBytes(Paths.get(file.getPath()));
    }


    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public static boolean isWindows() {return (OS.contains("win"));}

    public static boolean isMac() {return (OS.contains("mac"));}

    public static boolean isUnix() {return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));}

}
