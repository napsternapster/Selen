package com.eon.xbet.mobile.pagesMobile;

import com.eon.xbet.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class MainPageMobile extends BasePage{


    public MainPageMobile(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Ставки на спорт онлайн | Букмекерская контора 1XBET.COM";
        this.PAGE_URL = "https://1xbet.mobi/";
    }

    //Top Menu
    @FindBy (css = ".header__col a:nth-child(1)")  WebElement registration_button;
    @FindBy (css = ".header__col a:nth-child(2)")  WebElement login_button;
    @FindBy (css = ".hamburger.active")  WebElement hamburger_button;

    //Login
    @FindBy (id = "idOrMail")  WebElement email_id;
    @FindBy (id = "uPassword")  WebElement password;
    @FindBy (id = "userConButton")  WebElement apply_login_button;
    @FindBy (className = "forgot-passw")  WebElement forgot_pass;

    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(1)")  WebElement vk_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(2)")  WebElement fb_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(3)")  WebElement ok_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(4)")  WebElement gplus_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(5)")  WebElement ya_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(6)")  WebElement mail_login;
    @FindBy (css = ".social-list.social-list_theme-small li:nth-child(7)")  WebElement teleg_login;

    @FindBy (css = ".auth__footer a")  WebElement reg_login;
    @FindBy (css = "#modalContentId")  WebElement errormessage;


    @FindBy (css = ".block-img.block-img_small.block-img_1st")  WebElement reserve100_button;
    @FindBy (css = "span.coupon-widget__num")  WebElement coupon_num;
    @FindBy (css = ".coupon__close.btn.btn_no-text")  WebElement coupon_close;

    @FindAll(@FindBy (css = ".coef__item.coef__num"))  private List<WebElement> bets;




    public void setText_LoginField(String text){
        setElementText(email_id, text);
    }

    public void setText_PassField(String text){
        setElementText(password, text);
    }

    public void click_ApplyLogin() throws InterruptedException {clickElement(apply_login_button);
        Thread.sleep(1000);
//        assertEquals(registration_button.getText(), "Пополнение" );
 }

    public void click_LoginButton(){
        clickElement(login_button);
    }

    public void loadPage(){
        driver.get(getPAGE_URL());
        assertEquals(driver.getTitle(), getPAGE_TITLE());
    }

    public void set_login_and_pass(String login, String pass){
        setElementText(email_id, login);
        setElementText(password, pass);

    }

    public void click100Button(){
        clickElement(reserve100_button);
    }


    public void beting() throws InterruptedException {
        for(int i=0; i<bets.size(); i++){
            if(i==2) {
                break;
            }
            else {
                bets.get(i).click();
                coupon_close.click();
                Thread.sleep(500);
            }
        }

    }


}
