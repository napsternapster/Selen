package com.eon.xbet.mobile.testsMobile;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import com.eon.xbet.mobile.pagesMobile.MainPageMobile;
import com.eon.xbet.mobile.pagesMobile.RegistrationMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class LoginMobileTest {

    DriverFactory.BrowserType type = DriverFactory.BrowserType.CHROME;
    MainPageMobile mainPageMobile;
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageMobile = PageFactory.initElements(driver, MainPageMobile.class);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.close();
    }

    @Test
    public void positiveLoginTest() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("aqa.denis.karlinsky@gmail.com", "qwerty1");
        mainPageMobile.click_ApplyLogin();

    }

    //Поля электронной почты и пароля пусты
    @Test
    public void verify2() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("", "");
        mainPageMobile.click_ApplyLogin();
        assertEquals(driver.findElement(By.id("modalContentId")).getText(),"Для входа в личный кабинет, введите, пожалуйста, ваш логин и пароль.");
    }

    //Поле электронной почты заполнено, а поле «Пароль» пустое.
    @Test
    public void verify3() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("qweqweqweqwe", "");
        mainPageMobile.click_ApplyLogin();
        assertEquals(driver.findElement(By.id("modalContentId")).getText(),"Для входа в личный кабинет, введите, пожалуйста, ваш логин и пароль.");
    }

    //Поле электронной почты пустое и поле Пароль заполнено
    @Test
    public void verify4() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("", "12312312");
        mainPageMobile.click_ApplyLogin();
        assertEquals(driver.findElement(By.id("modalContentId")).getText(),"Для входа в личный кабинет, введите, пожалуйста, ваш логин и пароль.");
    }

    //Email и пароль введены неверно
    @Test
    public void verify5() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("sad2123", "asease21");
        mainPageMobile.click_ApplyLogin();
        assertEquals(driver.findElement(By.id("modalContentId")).getText(),"Для входа в личный кабинет, введите, пожалуйста, ваш логин и пароль.");
    }

    //Электронная почта неверна и пароль верен
    @Test
    public void verify6() throws InterruptedException {
        driver.manage().deleteAllCookies();
        mainPageMobile.loadPage();
        Thread.sleep(2000);
        mainPageMobile.click_LoginButton();
        mainPageMobile.set_login_and_pass("sadsdas", "qwerty1");
        mainPageMobile.click_ApplyLogin();
        assertEquals(driver.findElement(By.id("modalContentId")).getText(),"Для входа в личный кабинет, введите, пожалуйста, ваш логин и пароль.");
    }



}
