

import com.eon.aqa.qa.xbetPages.DriverFactory;
import com.eon.aqa.qa.xbetPages.MainPageXbet;
import com.eon.aqa.qa.xbetPages.MainPageXbetUA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.eon.aqa.qa.xbetPages.DriverFactory.BrowserType.*;

public class RegistrationTest {
    DriverFactory.BrowserType type = OPERA;
    MainPageXbetUA mainPageXbetUA;
    WebDriver driver;
    MainPageXbet mainPageXbet;

    @BeforeClass(alwaysRun = true)
    public void setup(){

        this.driver = DriverFactory.getDriver(type);
        mainPageXbet = PageFactory.initElements(driver, MainPageXbet.class);
        mainPageXbetUA = PageFactory.initElements(driver, MainPageXbetUA.class);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.close();
    }

    @Test
    public void testSignUp(){
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPageXbet.loadPage();
        mainPageXbet.changeLanguage();
        mainPageXbetUA.clickRegistrationButton();
        mainPageXbetUA.ByPhoneNumberReg();
        mainPageXbetUA.ByEmailReg();
        mainPageXbetUA.BySocialNet();

    }



}
