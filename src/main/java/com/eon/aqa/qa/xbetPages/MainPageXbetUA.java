package com.eon.aqa.qa.xbetPages;

import com.eon.aqa.qa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPageXbetUA extends BasePage {

    //Registration
    @FindBy(className = "register_button_main")      WebElement button_main_registration;
    //By Phone number
    @FindBy(xpath = ".//*[@id='reg_tabs']/li[2]/a")  WebElement button_By_PhoneNum_Reg;
    @FindBy(id = "reg_tel_num")  WebElement field_PhoneNumber_ByPhone;
    @FindBy(css = ".selectize-input items full has-options has-items")  WebElement select_Money_ByPhone;
    //By e-mail
    @FindBy(xpath = ".//*[@id='reg_tabs']/li[3]/a")  WebElement button_By_Email_Reg;
    @FindBy(xpath = ".//*[@id='x_registration_form']/div/ul/li[1]/span[2]/div/div[1]")  WebElement select_Country_ByEmail;
    @FindBy(id = "reg_region_id-selectized")  WebElement field_Region_ByEmail;
    @FindBy(id = "reg_city_id-selectized")  WebElement field_City_ByEmail;
    @FindBy(id = "reg_name")  WebElement field_Name_ByEmail;
    @FindBy(id = "reg_surname")  WebElement field_Surname_ByEmail;
    @FindBy(xpath = ".//*[@id='x_registration_form']/div/ul/li[2]/span[2]/div/div[1]")  WebElement select_Money_ByEmail;
    @FindBy(id = "reg_password")  WebElement field_Password_ByEmail;
    @FindBy(id = "reg_password_again")  WebElement field_PasswordRe_ByEmail;
    @FindBy(id = "reg_email")  WebElement field_Email_ByEmail;
    @FindBy(id = "reg_tel_num")  WebElement field_Telephone_ByEmail;

    //Social Networks
    @FindBy(xpath = ".//*[@id='reg_tabs']/li[4]/a")  WebElement button_BySocialNet;
    @FindBy(className = "vk_reg")  WebElement button_VK_BySocialNet;
    @FindBy(className = "ok_reg")  WebElement button_OK_BySocialNet;
    @FindBy(className = "fb_reg")  WebElement button_FB_BySocialNet;
    @FindBy(className = "gplus_reg")  WebElement button_GPlus_BySocialNet;
    @FindBy(className = "yandex_reg")  WebElement button_Yandex_BySocialNet;
    @FindBy(className = "mailru_reg")  WebElement button_MailRu_BySocialNet;





    @FindBy(id = "reg_ref_code")  WebElement field_promocode;
    @FindBy(className = "submit_registration")  WebElement button_register_pop_up;
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
                .until(ExpectedConditions.presenceOfElementLocated((By) field_promocode));

    }

    public void ByPhoneNumberReg(){
        clickElement(button_By_PhoneNum_Reg);
        clickElement(field_PhoneNumber_ByPhone);
        field_PhoneNumber_ByPhone.sendKeys("666666");


    }

    public void ByEmailReg(){
        clickElement(button_By_Email_Reg);
        clickElement(select_Country_ByEmail);
        setElementText(field_Region_ByEmail, "киев");
        field_Region_ByEmail.sendKeys(Keys.ENTER);
        setElementText(field_City_ByEmail, "киев");
        field_City_ByEmail.sendKeys(Keys.ENTER);
        setElementText(field_Name_ByEmail, "Denis");
        clickElement(field_Surname_ByEmail);
        setElementText(field_Surname_ByEmail, "Deni");
        clickElement(field_Password_ByEmail);
        setElementText(field_Password_ByEmail, "111");
        clickElement(field_PasswordRe_ByEmail);
        setElementText(field_PasswordRe_ByEmail, "111");
        clickElement(field_Telephone_ByEmail);
        setElementText(field_Telephone_ByEmail, "5554444");

    }

    public void BySocialNet(){
        clickElement(button_BySocialNet);
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
