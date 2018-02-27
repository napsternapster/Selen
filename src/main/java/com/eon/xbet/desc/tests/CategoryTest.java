package com.eon.xbet.desc.tests;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.desc.qa.xbetPages.LivePage;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbet;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CategoryTest {
    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    WebDriver driver;
    MainPageXbet mainPageXbet;
    LivePage livePage;
    ExtentReports report;
    ExtentTest logger;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageXbet = PageFactory.initElements(driver, MainPageXbet.class);
        livePage = PageFactory.initElements(driver, LivePage.class);


    }


//    @AfterMethod
//
//    public void getResult(ITestResult result) throws IOException
//    {
//        if(result.getStatus() == ITestResult.FAILURE)
//        {
//            String screenShotPath = GetScreenShot.capture(driver, "screenShotName");
//            logger.log(LogStatus.FAIL, result.getThrowable());
//            logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addScreenCapture(screenShotPath));
//        }
//        report.endTest(logger);
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void teardown(){
//
//        report.flush();
//        driver.get("C:\\Users\\localuser\\Desktop\\IdeaProjects\\test-output\\ExtentScreenshot.html");
//
//    }

    @Test
    public void checkCategoryList(){
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        livePage.loadPage();
        mainPageXbet.clickCloseBanner();
//        livePage.scrollPanel();
        livePage.checkCategory();
        driver.close();
    }



}
