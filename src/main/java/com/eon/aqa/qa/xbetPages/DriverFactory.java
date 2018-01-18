package com.eon.aqa.qa.xbetPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    public enum BrowserType{
        FIREFOX,
        CHROME,
        OPERA,
        IE,
        SAFARI
    }

    public static WebDriver getDriver(BrowserType type){
        WebDriver driver = null;
        switch (type){
            case CHROME:
                System.setProperty("webdriver.chrome.driver","C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case OPERA:
                System.setProperty("webdriver.chrome.driver","C:\\MyWebDriver\\operadriver.exe");
                driver = new OperaDriver();
                break;
            case IE:
                System.setProperty("webdriver.edge.driver","C:\\MyWebDriver\\MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
