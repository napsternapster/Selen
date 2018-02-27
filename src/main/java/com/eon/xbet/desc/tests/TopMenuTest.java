package com.eon.xbet.desc.tests;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TopMenuTest {
    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    WebDriver driver;
    MainPageXbet mainPageXbet;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageXbet = PageFactory.initElements(driver, MainPageXbet.class);

    }

    @Test
    public void topMenu() throws InterruptedException {
        driver.manage().window().maximize();
        mainPageXbet.loadPage();
        mainPageXbet.clickCloseBanner();
        mainPageXbet.checkTopMenu();
        driver.close();
    }



}
