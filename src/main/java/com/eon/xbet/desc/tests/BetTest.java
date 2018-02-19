package com.eon.xbet.desc.tests;

import com.eon.xbet.data.RegistrationData;
import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbet;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbetUA;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BetTest {
    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    MainPageXbetUA mainPageXbetUA;
    WebDriver driver;
    MainPageXbet mainPageXbet;
    ExtentReports report;
    ExtentTest logger;

    @DataProvider(name = "browser-provider", parallel = true)
    public Object[][] provide() throws Exception {
        return new Object[][] {
                {DriverFactory.BrowserType.CHROME, "TABLETS"},
                {DriverFactory.BrowserType.FIREFOX, "MICE"},
                {DriverFactory.BrowserType.OPERA, "LAPTOPS"}};
    }


    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageXbet = PageFactory.initElements(driver, MainPageXbet.class);


    }

    @Test(groups = {"Bet Tests"}, dataProviderClass = RegistrationData.class, dataProvider = "sites")
    public void checkValue(String url, String title){
       driver.get(url);
        driver.getTitle();
//       assertEquals(driver.getTitle(), title);
//        mainPageXbet.checkBonus();
        driver.close();
    }


}
