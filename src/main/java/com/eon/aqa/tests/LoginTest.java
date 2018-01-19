package com.eon.aqa.tests;
import com.eon.aqa.qa.data.Utility;
import com.eon.aqa.qa.xbetPages.DriverFactory;
import com.eon.aqa.qa.xbetPages.MainPageXbet;
import com.eon.aqa.qa.xbetPages.MainPageXbetUA;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static com.eon.aqa.qa.data.Utility.captureScreenshot;
import static com.eon.aqa.qa.xbetPages.DriverFactory.BrowserType.CHROME;
import static org.testng.Assert.*;

public class LoginTest {

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
    public void tearDown(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {

            String screenshot_path= Utility.captureScreenshot(driver, result.getName());
            String image= logger.addScreenCapture(screenshot_path);
            logger.log(LogStatus.FAIL, "Title verification", image);


        }

        report.endTest(logger);
        report.flush();

        driver.get("C:\\Users\\localuser\\Desktop\\Reports\\advanceReport.html");
    }

//    @AfterClass(alwaysRun = true)
//    public void teardown(){
//        driver.close();
//
//    }

    @Test(priority = 1)
    public void login(){

        report = new ExtentReports("C:\\Users\\localuser\\Desktop\\Reports\\advanceReport.html", false);
        logger = report.startTest("Login Test", "Тест про логирование");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.log(LogStatus.INFO, "Browser is up and running");
        mainPageXbet.loadPage();
        logger.log(LogStatus.INFO, "Application is up and running");
        mainPageXbet.clickLogin();
        mainPageXbet.setText_EmailLogin("aqa.denis.karlinsky@gmail.com");
        mainPageXbet.setText_PasswordlLogin("qwerty1");
        mainPageXbet.clickEnterButton();
        logger.log(LogStatus.INFO, "Autorized");
        assertNotNull(mainPageXbet.button_special_cabinet);
        logger.log(LogStatus.PASS, "Login Test has been verified");


    }
    @Test(priority = 2)
    public void logout(){
        mainPageXbet.moveToSpecialCabinet();
        mainPageXbet.clickLogOut();
        assertNotNull(mainPageXbetUA.button_main_registration);
    }


}
