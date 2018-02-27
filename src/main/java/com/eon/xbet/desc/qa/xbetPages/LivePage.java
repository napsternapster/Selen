package com.eon.xbet.desc.qa.xbetPages;

import com.eon.xbet.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LivePage extends BasePage {
    public LivePage(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "LIVE ставки на спорт | Букмекерская контора 1XBET.COM";
        this.PAGE_URL = "https://1xbetua.com/live/";
    }


    //Categories
    @FindBy (css = "#allSport a[href*='live/Football']") WebElement football;
    @FindBy (css = "#allSport a[href='live/Ice-Hockey/']")  WebElement hockey;
    @FindBy (css = "#allSport a[href='live/Basketball/']")  WebElement basketball;
    @FindBy (css = "#allSport a[href='live/Tennis/']")  WebElement tennis;
    @FindBy (css = "#allSport a[href='live/Volleyball/']")  WebElement volleyball;
    @FindBy (css = "#allSport a[href='live/Table-Tennis/']")  WebElement tableTennis;
    @FindBy (css = "#allSport a[href='live/Flatout/']")  WebElement flatout;
    @FindBy (css = "#allSport a[href='live/FIFA/']")  WebElement fifa;
    @FindBy (css = "#allSport a[href='live/Mortal-Kombat/']")  WebElement MK;
    @FindBy (css = "#allSport a[href='live/Counter-Strike/']")  WebElement CS;
    @FindBy (css = "#allSport a[href='live/Dolgosrochnye/']")  WebElement dolgosrochnye;
    @FindBy (css = "#allSport a[href='live/Biathlon/']")  WebElement biatlon;
    @FindBy (css = "#allSport a[href='live/Alpine-Skiing/']")  WebElement GornyeLygi;
    @FindBy (css = "#allSport a[href='live/Ski-Jumping/']")  WebElement prygkiTramp;
    @FindBy (css = "#allSport a[href='live/Skiing/']")  WebElement lygi;
    @FindBy (css = "#allSport a[href='live/Curling/']")  WebElement kerling;
    @FindBy (css = "#allSport a[href='live/Olympiad/']")  WebElement olimpiada;
    @FindBy (css = "#allSport a[href='live/Figure-Skating/']")  WebElement figurnoeKatanie;
    @FindBy (css = "#allSport a[href='live/Speed-Skating/']")  WebElement konkobegniy;
    @FindBy (css = "#allSport a[href='live/Freestyle-skiing/']")  WebElement freestyle;
    @FindBy (css = "#allSport a[href='live/Bobsleigh/']")  WebElement bobslei;
    @FindBy (css = "#allSport a[href='live/Nordic-combined/']")  WebElement lygnoe2Borie;
    @FindBy (css = "#allSport a[href='live/Luge/']")  WebElement sanniySprort;
    @FindBy (css = "#allSport a[href='live/Short-Track-Speed-Skating/']")  WebElement shortTrack;
    @FindBy (css = "#allSport a[href='live/Snowboarding/']")  WebElement snowboard;
    @FindBy (css = "#allSport a[href='live/BattleField/']")  WebElement battlefield;
    @FindBy (css = ".rollbar-handle")  WebElement block;
    @FindBy (xpath = ".//*[@id='hottest_games']//div/a[2]") WebElement titleTable;






    public void checkCategory(){
        clickElement(football);
        assertEquals("Футбол", titleTable.getText());
        clickElement(football);
        clickElement(tennis);
        assertEquals("Теннис", titleTable.getText());
        clickElement(tennis);
        clickElement(basketball);
        assertEquals("Баскетбол", titleTable.getText());
        clickElement(basketball);
        clickElement(hockey);
        assertEquals("Хоккей", titleTable.getText());
        clickElement(hockey);
        clickElement(volleyball);
        assertEquals("Волейбол", titleTable.getText());
        clickElement(volleyball);
        clickElement(tableTennis);
        assertEquals("Настольный теннис", titleTable.getText());
        clickElement(tableTennis);
        clickElement(flatout);
        assertEquals("Flatout", titleTable.getText());
        clickElement(flatout);
        clickElement(fifa);
        assertEquals("FIFA", titleTable.getText());
        clickElement(fifa);
        clickElement(MK);
        assertEquals("MortalKombat", titleTable.getText());
        clickElement(MK);
        clickElement(CS);
        assertEquals("Counter Strike", titleTable.getText());
        clickElement(CS);
    }

    public void loadPage(){
        driver.get(getPAGE_URL());
        assertEquals(driver.getTitle(), getPAGE_TITLE());
    }

//    public void scrollPanel() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        Coordinates cor=((Locatable)tableTennis).getCoordinates();
//        cor.inViewPort();
//        Thread.sleep(1000);
////        actions.moveToElement(hockey);
////        jse.executeScript("scroll(0, 250)");
//    }


}
