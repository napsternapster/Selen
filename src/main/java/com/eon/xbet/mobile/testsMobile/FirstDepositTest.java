package com.eon.xbet.mobile.testsMobile;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.mobile.pagesMobile.FirstDepositPage;
import com.eon.xbet.mobile.pagesMobile.MainPageMobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstDepositTest {

    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    MainPageMobile mainPageMobile;
    FirstDepositPage firstDepositPage;
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageMobile = PageFactory.initElements(driver, MainPageMobile.class);
        firstDepositPage = PageFactory.initElements(driver, FirstDepositPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.close();
    }

    @Test
    public void positiveLoginTest() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(1500);
//        mainPageMobile.click100Button();
        firstDepositPage.checkBonus("100%-Й БОНУС НА ПЕРВЫЙ ДЕПОЗИТ 3000 UAH!", "1. Пользователь имеет право получить только 1 бонус. Минимальное пополнение счета для его получения = 100 рублей.");

    }
}
