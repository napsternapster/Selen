package com.eon.aqa.qa.xbetPages;

import com.eon.aqa.qa.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecCabinetXbetUA extends BasePage {

    public SpecCabinetXbetUA(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Особисті дані | Букмекерська контора 1XBET.COM";
        this.PAGE_URL = "https://1xbetua.com/ua/office/account/";
    }

    @FindBy(xpath = ".//*[@id='link_email']/div[1]")  WebElement cancel_email_acc;





}
