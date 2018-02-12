package com.eon.aqa.tests;

import com.eon.aqa.qa.xbetPages.DriverFactory;
import com.eon.aqa.qa.xbetPages.LivePage;
import com.eon.aqa.qa.xbetPages.MainPageXbet;
import com.eon.aqa.qa.xbetPages.MainPageXbetUA;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.eon.aqa.qa.xbetPages.DriverFactory.BrowserType.CHROME;

public class BetTest {
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


    }

    @Test
    public void checkValue(){
       mainPageXbet.loadPage();
        mainPageXbet.checkBonus();
        driver.close();
    }


}
