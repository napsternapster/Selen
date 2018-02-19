package com.eon.xbet.desc.qa.xbetPages;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Arrays;

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
        DesiredCapabilities capabilities=null;

        switch (type){
            case CHROME:
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--proxy-server=109.198.192.205:53281");
                System.setProperty("webdriver.chrome.driver","C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe");
                driver = new ChromeDriver();
//                driver = new ChromeDriver(options);

                break;
            case FIREFOX:
//                System.setProperty("webdriver.firefox.driver","C:\\MyWebDriver\\geckodriver.exe");
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

    public enum Sites {
        UA,
        CN,
        CM,
        IR,
        KZ
    }

//    public static String getSites(){
//
//    }


}
