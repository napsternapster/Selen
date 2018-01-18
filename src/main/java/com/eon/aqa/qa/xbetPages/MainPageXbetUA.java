package com.eon.aqa.qa.xbetPages;

import com.eon.aqa.qa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPageXbetUA extends BasePage {

    @FindBy(className = "register_button_main")  WebElement button_main_registration;
    @FindBy(id = "reg_ref_code")  WebElement promocode_1click;
    @FindBy(id = "reg_ref_code")  WebElement button_register_pop_up;
    @FindBy(id = "account-info-button-image")  WebElement saveFile_account;
    @FindBy(xpath = ".//*[@id='bind-phone']/span")  WebElement button_skip_after_reg;
    @FindBy(xpath = ".//*[@id='loginout']/span[3]/a")  WebElement button_special_cabinet;




    @FindBy(className = "curlangDropTop")  WebElement field_language;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[45]/a") WebElement field_language_ua;
    @FindBy(className = "curloginDropTop") WebElement field_login_ua;

    public MainPageXbetUA(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Букмекерська контора 1XBET.COM. Ставки на спорт онлайн | Букмекерська контора 1XBET.COM";
        this.PAGE_URL = "https://1xbetua.com/ua/";
    }

    public void clickRegistrationButton(){
        clickElement(button_main_registration);

    }
    public void clickRegistrationPopUp()
    {
        clickElement(button_register_pop_up);
    }
    public void checkPromotionFeild(){
        WebElement explicitWait = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated((By) promocode_1click));

    }

    public void saveFile(){

    }

    public void click_skip_reg(){
        clickElement(button_skip_after_reg);
        clickElement(button_skip_after_reg);
        clickElement(button_skip_after_reg);
    }

    public void click_special_cab(){
        clickElement(button_special_cabinet);

    }








}
