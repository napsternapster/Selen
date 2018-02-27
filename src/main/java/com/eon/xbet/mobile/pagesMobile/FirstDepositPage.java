package com.eon.xbet.mobile.pagesMobile;

import com.eon.xbet.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertEquals;

public class FirstDepositPage extends BasePage {

    public FirstDepositPage(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Первый депозит | Букмекерская контора 1XBET.COM";
        this.PAGE_URL = "https://1xbet.mobi/bonus/rules/1st/";
    }

    @FindBy (className = "block-img__title") WebElement bonus_title;
    @FindBy (xpath = "//article//div/ul[1]/li[1]") WebElement minimal_donate;

    public void checkBonus(String title, String donate){
        assertEquals(bonus_title.getText(), title);
        assertEquals(minimal_donate.getText(), donate);

    }

}
