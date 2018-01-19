package com.eon.aqa.qa.xbetPages;

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

//    public static void proxyUsingChromeDriver()
//    {
//        //Set the location of the ChromeDriver
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe");
//        //Create a new desired capability
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        // Create a new proxy object and set the proxy
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("5.148.150.155:8080");
//        //Add the proxy to our capabilities
//        capabilities.setCapability("proxy", proxy);
//        //Start a new ChromeDriver using the capabilities object we created and added the proxy to
//        ChromeDriver Driver = new ChromeDriver(capabilities);
//
//    }




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
        Proxy proxy = new Proxy();

        switch (type){
            case CHROME:
                System.setProperty("webdriver.chrome.driver","C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe");
                driver = new ChromeDriver();
//                proxy.setHttpProxy("5.148.150.155:8080");
//                capabilities.setCapability("proxy", proxy);
//                ChromeOptions options = new ChromeOptions();
//                options.addExtensions(new File("C:\\Users\\localuser\\Desktop\\IdeaProjects\\chromedriver.exe"));
//                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//                driver = new ChromeDriver(capabilities);

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
}
