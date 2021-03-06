package com.eon.xbet.desc.qa.xbetPages;

import com.eon.xbet.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class MainPageXbet extends BasePage {

    public MainPageXbet(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Ставки на спорт онлайн | Букмекерская контора 1XBET.COM";
        this.PAGE_URL = "https://1xbetua.com/";

    }

    //Верхний блок (регистрация, авторизакция)

    @FindBy(className = "win_load") WebElement button_1wix_load;
    @FindBy(className = "access_load") WebElement button_block_bypass;
    @FindBy(className = "smart_load") WebElement button_phone_load;
    @FindBy(className = "telegram_icon") WebElement button_telegram;
    @FindBy(className = "paymentsTLBut") WebElement button_paymant;
    @FindBy(className = "callbackTLBut") WebElement button_callback;
    @FindBy(xpath = ".//*[@id='user-money']/div/div/a/div") WebElement field_balance_acc;
    @FindBy(xpath = ".//*[@id='wednesdayX2']/div[1]") WebElement closeBannerWednesday_button;
    @FindBy(css = ".olympic-pop-close.arcticmodal-close") WebElement closeBannerOlympic_button;
    @FindBy(className = "up-funds-button-green") WebElement button_donate_green;
    @FindBy(id = "uMessage") WebElement button_message_top;
    public @FindBy(xpath = ".//*[@id='loginout']/span[3]/a")  WebElement button_special_cabinet;
    @FindBy(css = ".lk_header_options_item.lk_header_options_exit.exitLink>a")  WebElement field_logOut_top;
    @FindBy(className = "curcoefDropTop")  WebElement button_settings_top;
    @FindBy(className = "timeButTopFl")  WebElement button_choose_time;
    @FindBy(className = "curlangDropTop") WebElement field_language;


    //Языки
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[1]/a") WebElement field_language_ae;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[2]/a") WebElement field_language_al;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[3]/a") WebElement field_language_au;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[4]/a") WebElement field_language_az;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[5]/a") WebElement field_language_by;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[6]/a") WebElement field_language_bg;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[7]/a") WebElement field_language_cz;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[8]/a") WebElement field_language_dk;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[9]/a") WebElement field_language_us;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[10]/a") WebElement field_language_de;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[11]/a") WebElement field_language_gr;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[12]/a") WebElement field_language_en;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[13]/a") WebElement field_language_es;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[14]/a") WebElement field_language_et;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[15]/a") WebElement field_language_ir;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[16]/a") WebElement field_language_fi;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[17]/a") WebElement field_language_fr;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[18]/a") WebElement field_language_he;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[19]/a") WebElement field_language_hi;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[20]/a") WebElement field_language_hr;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[21]/a") WebElement field_language_hu;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[22]/a") WebElement field_language_id;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[23]/a") WebElement field_language_it;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[24]/a") WebElement field_language_jp;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[25]/a") WebElement field_language_ge;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[26]/a") WebElement field_language_km;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[27]/a") WebElement field_language_kr;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[28]/a") WebElement field_language_kz;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[29]/a") WebElement field_language_lt;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[30]/a") WebElement field_language_lv;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[31]/a") WebElement field_language_mk;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[32]/a") WebElement field_language_mn;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[33]/a") WebElement field_language_ms;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[34]/a") WebElement field_language_nb;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[35]/a") WebElement field_language_nl;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[36]/a") WebElement field_language_pl;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[37]/a") WebElement field_language_pt;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[38]/a") WebElement field_language_br;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[39]/a") WebElement field_language_ro;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[40]/a") WebElement field_language_ru;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[41]/a") WebElement field_language_sk;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[42]/a") WebElement field_language_rs;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[43]/a") WebElement field_language_se;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[44]/a") WebElement field_language_th;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[45]/a") WebElement field_language_tr;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[46]/a") WebElement field_language_ua;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[47]/a") WebElement field_language_cn;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[48]/a") WebElement field_language_tw;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[49]/a") WebElement field_language_vi;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[50]/a") WebElement field_language_iq;
    @FindBy(xpath = ".//*[@id='loc_info']/div[4]/div/ul/li[51]/a") WebElement field_language_uz;

//основное меню
    //Sports(Line)
    @FindBy(id = "line_href") WebElement top_menu_sports;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[1]") WebElement sub_sports_matchday;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[2]") WebElement sub_sports_bet_team;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[3]") WebElement sub_sports_bet_tournam;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[4]") WebElement sub_sports_constructor;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[5]") WebElement sub_sports_bet_exchange;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[2]/ul/li/a[6]") WebElement sub_sports_digital_sp_tech;

    //Live
    @FindBy(id = "live_href") WebElement top_menu_live;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[3]/ul/li/a[1]") WebElement sub_live_bet_team;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[3]/ul/li/a[2]") WebElement sub_live_cockfight;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[3]/ul/li/a[3]") WebElement sub_live_multi_live;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[3]/ul/li/a[4]") WebElement sub_live_live_previews;
    @FindBy(xpath = "..//*[@id='games_top_menu']/ul/li[3]/ul/li/a[5]") WebElement sub_live_eSprots;

    //Promotions
    @FindBy(id = "share") WebElement top_menu_promotions;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[4]/div/div/a[1]") WebElement sub_promo_fifa;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[4]/div/div/a[2]") WebElement sub_promo_seria_a;
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[4]/div/div/a[3]") WebElement sub_promo_lucky_day;

    //Slots
    @FindBy(xpath = ".//*[@id='games_top_menu']/ul/li[5]/a") WebElement top_menu_slots;

    //1xGames
    @FindBy(css = ".menu_button.menu_dropdown  a[href='ourgames']") WebElement top_menu_1xgames;

    //1XBonus
    @FindBy(css = ".menu_button  a[href='bonus/']") WebElement top_menu_1xbonus;

    //1XCasino
    @FindBy(css = ".menu_button.menu_dropdown  a[href='casino/']") WebElement top_menu_live_casino;


    //Login
    @FindBy(className = "loginDropTop") WebElement button_login_top;
    @FindBy(id = "userLogin") WebElement field_userLogin_top;
    @FindBy(id = "userPassword") WebElement field_userPassword_top;
    @FindBy(id = "userConButton") WebElement button_userEnter_top;


    @FindBy(className = "curloginDropTop") WebElement field_login_ua;
//    @FindBy(className = "curlangDropTop") WebElement field_language;
//    @FindBy(className = "curlangDropTop") WebElement field_language;
//    @FindBy(className = "curlangDropTop") WebElement field_language;

   @FindBy(xpath = "html/body/div[6]/div[3]/div/button[1]") WebElement button_logOut_yes;
   @FindBy(xpath = ".//*[@id='allSport']/div//a") List<WebElement> allSport;

//---------------------------------------------------------------------//
    @FindBy(xpath = "//*[@id=\"loc_info\"]/div[2]/a[4]/b") WebElement bonus_button;


    public void login(String email, String password){
        clickLogin();
        setText_PasswordlLogin(password);
        setText_EmailLogin(email);

    }

    public void changeLanguage(){
        clickElement(field_language);
        clickElement(field_language_ua);
    }


    public void checkBanners(String text){

    }

    public void clickLogin(){
        clickElement(button_login_top);
    }



    public void setText_PasswordlLogin(String text){
        setElementText(field_userPassword_top, text);
    }

    public void setText_EmailLogin(String text){
        setElementText(field_userLogin_top, text);
    }

    public void clickEnterButton(){
        clickElement(button_userEnter_top);
    }



    public void moveToSpecialCabinet(){
        Actions builder = new Actions(driver);
        builder.moveToElement(button_special_cabinet).build().perform();
    }

    public void clickLogOut(){
        clickElement(field_logOut_top);
    }

    public void clickYesButton(){
        clickElement(button_logOut_yes);
    }

    public void clickCloseBanner(){
        clickElement(closeBannerOlympic_button);
    }

    public void cliclLivePage(){
        clickElement(top_menu_live);
    }

    public void checkBonus(){
        assertEquals(bonus_button.getText(), "3000 UAH\n" +
                "БОНУС");
    }

    public void checkTopMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(top_menu_sports).perform();
        Thread.sleep(2000);
        actions.moveToElement(top_menu_live).perform();
        Thread.sleep(2000);
        actions.moveToElement(top_menu_slots).perform();
        Thread.sleep(2000);
        actions.moveToElement(top_menu_live_casino).perform();
        Thread.sleep(2000);
        actions.moveToElement(top_menu_1xgames).perform();
        Thread.sleep(2000);
        actions.moveToElement(top_menu_1xbonus).perform();
        Thread.sleep(2000);
    }







}
