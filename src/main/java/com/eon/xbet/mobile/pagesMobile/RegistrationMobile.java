package com.eon.xbet.mobile.pagesMobile;

import com.eon.xbet.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class RegistrationMobile extends BasePage{

    public RegistrationMobile(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Регистрация | Букмекерская контора 1XBET.COM";
        this.PAGE_URL = "https://1xbet.mobi/user/registration";
    }

    //Menu
    @FindBy (css = "tabs__link tabs__link_fast active")  WebElement oneClick_menu;
    @FindBy (css = "tabs__link tabs__link_phone active")  WebElement phoneNum_menu;
    @FindBy (xpath = "//*[@id=\"reg_tabs\"]/li[3]/a")  WebElement email_menu;
    @FindBy (css = "tabs__link tabs__link_soc")  WebElement social_menu;



    //FIELDS
    @FindBy (css = "selectize-control error theme-default theme-default_withIco select-country single")  WebElement country_select;
    @FindBy (css = "selectize-control error theme-default theme-default_withIco select-currency single")  WebElement currency_select;
    @FindBy (css = "input-wrap withIco ref_code-ico")  WebElement promocode_field;
    @FindBy (id = "reg_tel_num")  WebElement phone_field;
    @FindBy (id = "reg_region_id-selectized")  WebElement region_field;
    @FindBy (id = "reg_city_id-selectized")  WebElement city_field;
    @FindBy(id = "reg_name")  WebElement name_field;
    @FindBy(id = "reg_surname")  WebElement surname_field;
    @FindBy(id = "reg_password")  WebElement reg_pass_field;
    @FindBy(id = "reg_password_again")  WebElement reg_pass_again_field;
    @FindBy(id = "reg_email")  WebElement email_field;
    @FindBy(id = "button_registration")  WebElement reg_button;
    @FindBy(id = "reg_email-error")  WebElement email_error;
    @FindBy(id = "for_reg_phone")  WebElement phone_error;
    @FindBy(id = "reg_password-error")  WebElement pass_error;
    @FindBy(css = ".input-wrap.withIco.email-ico")  WebElement email_fuelas;
    @FindBy(xpath = ".//*[@id='x_registration_form']/div[2]/div/div[2]/div/div[3]")  WebElement volinska_region;




    public void loadPage(){
        driver.get(getPAGE_URL());
        assertEquals(driver.getTitle(), getPAGE_TITLE());
    }
    public void clickEmailMenu(){
        clickElement(email_menu);
    }

    public void setText_NameField(String text){
        setElementText(name_field, text);
    }

    public void setText_City(String text){
        setElementText(city_field, text);
        city_field.sendKeys(Keys.ENTER);
    }

    public void setText_SurnameField(String text){
        setElementText(surname_field, text);
    }

    public void setText_RegPass(String text){
        setElementText(reg_pass_field, text);
    }

    public void setText_RegPassAgain(String text){
        setElementText(reg_pass_again_field, text);
    }

    public void setText_Email(String text){

        setElementText(email_field, text);
        email_field.sendKeys(Keys.TAB);
    }

    public void setText_Phone(String text){

        setElementText(phone_field, text);
    }

    public void setText_Promocode(String text){
        setElementText(promocode_field, text);
    }

    public void clickRegButton(){
        clickElement(reg_button);
    }

    public void clickRegion(){
        clickElement(region_field);
    }

    public void clickVolin(){
        clickElement(volinska_region);
    }

    public void checkEmailError(){
        assertEquals(email_error.getText(), "Введите E-mail");
    }

    public void checkPhoneError(){
        assertEquals(phone_error.getText(), "Неверный номер");
    }

    public void checkPassError(){
        assertEquals(pass_error.getText(), "Минимум 6 символов, обязан содержать буквы и цифры.");
    }

}
