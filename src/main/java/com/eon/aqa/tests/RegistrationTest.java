package com.eon.aqa.tests;

import com.eon.aqa.qa.data.GetScreenShot;
import com.eon.aqa.qa.xbetPages.DriverFactory;
import com.eon.aqa.qa.xbetPages.MainPageXbet;
import com.eon.aqa.qa.xbetPages.MainPageXbetUA;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.eon.aqa.qa.xbetPages.DriverFactory.BrowserType.CHROME;
import static com.eon.aqa.qa.xbetPages.DriverFactory.BrowserType.FIREFOX;

public class RegistrationTest {
    DriverFactory.BrowserType type = CHROME;
    MainPageXbetUA mainPageXbetUA;
    WebDriver driver;
    MainPageXbet mainPageXbet;
    ExtentReports report;
    ExtentTest logger;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageXbet = PageFactory.initElements(driver, MainPageXbet.class);
        mainPageXbetUA = PageFactory.initElements(driver, MainPageXbetUA.class);

    }


    @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = GetScreenShot.capture(driver, "screenShotName");
            logger.log(LogStatus.FAIL, result.getThrowable());
            logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addScreenCapture(screenShotPath));
        }
        report.endTest(logger);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        report.flush();
        driver.get("C:\\Users\\localuser\\Desktop\\IdeaProjects\\test-output\\ExtentScreenshot.html");

    }

    @Test
    public void testSignUp(){
        report = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentScreenshot.html", true);
        logger = report.startTest("Registration Test", "Тест про регистрацию");
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.log(LogStatus.INFO, "Browser is up and running");
        mainPageXbet.loadPage();
        logger.log(LogStatus.INFO, "Application is up and running");
        mainPageXbet.changeLanguage();
        mainPageXbetUA.clickRegistrationButton();
        mainPageXbetUA.BySocialNet();
        mainPageXbetUA.ByPhoneNumberReg();
        mainPageXbetUA.ByEmailReg();


    }



}
