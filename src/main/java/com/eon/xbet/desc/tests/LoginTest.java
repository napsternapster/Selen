package com.eon.xbet.desc.tests;
import com.eon.xbet.data.GetScreenShot;
import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbet;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbetUA;
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

import static org.testng.Assert.*;

public class LoginTest{

    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
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
//        driver.close();
        driver.get("C:\\Users\\localuser\\Desktop\\IdeaProjects\\test-output\\ExtentScreenshot.html");

    }

    @Test(priority = 1)
    public void login(){

        report = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentScreenshot.html", true);
        logger = report.startTest("Login Test", "Тест про логирование");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.log(LogStatus.INFO, "Browser is up and running");
        mainPageXbet.loadPage();
        logger.log(LogStatus.INFO, "Application is up and running");
        mainPageXbet.clickLogin();
        mainPageXbet.setText_EmailLogin("aqa.denis.karlinsky@gmail.com");
//        mainPageXbet.setText_PasswordlLogin("qwerty1");
        mainPageXbet.setText_PasswordlLogin("qwerty");
        mainPageXbet.clickEnterButton();
        logger.log(LogStatus.INFO, "Autorized");
        assertNotNull(mainPageXbet.button_special_cabinet);
        logger.log(LogStatus.PASS, "Login Test has been verified");


    }
    @Test(priority = 2)
    public void logout(){
        mainPageXbet.clickCloseBanner();
        mainPageXbet.moveToSpecialCabinet();
        mainPageXbet.clickLogOut();
    }


}
