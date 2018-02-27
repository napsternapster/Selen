package com.eon.xbet.desc.tests;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LocalizationTest {
    @Test
    public void changeProxy() throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("1.1.168.52:8080");
        options.setCapability("1.1.168.52:8080", proxy);
        proxy.isAutodetect();
        driver = new ChromeDriver(options);
        driver.get("https://1xbet.com/");
        Thread.sleep(10000);
        driver.close();


    }

}
