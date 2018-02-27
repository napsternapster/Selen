package com.eon.xbet.mobile.testsMobile;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbet;
import com.eon.xbet.desc.qa.xbetPages.MainPageXbetUA;
import com.eon.xbet.mobile.pagesMobile.RegistrationMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class RegMobileTest {
    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    RegistrationMobile registrationMobile;
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        registrationMobile = PageFactory.initElements(driver, RegistrationMobile.class);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.close();
    }

    @Test
    public void regPostiveTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationMobile.loadPage();
        Thread.sleep(3000);
        registrationMobile.clickEmailMenu();
        registrationMobile.clickRegion();
        registrationMobile.clickVolin();
        registrationMobile.setText_City("Голобы");
        registrationMobile.setText_NameField("Igor");
        registrationMobile.setText_SurnameField("Igorev");
        registrationMobile.setText_RegPass("X1sdasdas");
        registrationMobile.setText_RegPassAgain("X1sdasdas");
        registrationMobile.setText_Email("x11@gmail.com");
        registrationMobile.setText_Phone("999562335");
        registrationMobile.clickRegButton();
        Thread.sleep(3000);
    }

    @Test
    public void regNegTest1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationMobile.loadPage();
        Thread.sleep(3000);
        registrationMobile.clickEmailMenu();
        registrationMobile.setText_Email("x11gmail.com");
        registrationMobile.checkEmailError();
        registrationMobile.clickRegButton();
        Thread.sleep(3000);
    }

    @Test
    public void regNegTest2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationMobile.loadPage();
        Thread.sleep(1500);
        registrationMobile.clickEmailMenu();
        registrationMobile.clickRegion();
        registrationMobile.clickVolin();
        registrationMobile.setText_City("Голобы");
        registrationMobile.setText_NameField("Igor");
        registrationMobile.setText_SurnameField("Igorev");
        registrationMobile.setText_RegPass("X1sdasdas");
        registrationMobile.setText_RegPassAgain("X1sdasdas");
        registrationMobile.setText_Email("x11@gmail.com");
        registrationMobile.setText_Phone("dada5$7567#7");
        registrationMobile.clickRegButton();
        Thread.sleep(1000);
        registrationMobile.checkPhoneError();

    }

    @Test
    public void regNegTest3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationMobile.loadPage();
        Thread.sleep(1500);
        registrationMobile.clickEmailMenu();
        registrationMobile.clickRegion();
        registrationMobile.clickVolin();
        registrationMobile.setText_City("Голобы");
        registrationMobile.setText_NameField("Igor");
        registrationMobile.setText_SurnameField("Igorev");
        registrationMobile.setText_RegPass("passw");
        registrationMobile.setText_RegPassAgain("X1sdasdas");
        registrationMobile.setText_Email("x11@gmail.com");
        registrationMobile.checkPassError();
        registrationMobile.setText_Phone("999562335");
        registrationMobile.clickRegButton();
        Thread.sleep(1000);

    }
}
