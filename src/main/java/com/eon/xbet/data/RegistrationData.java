package com.eon.xbet.data;

import com.eon.xbet.desc.qa.xbetPages.DriverFactory;
import org.testng.annotations.DataProvider;

public class RegistrationData {

    @DataProvider(name = "signup")
    public static Object[][] signup(){
        return new Object[][]{
                {"QA", "Denis", "aqa.denis.karlinsky@gmail.com", "123123"},
                {"", "3123123", "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт."}

        };
    }

    @DataProvider(name = "sites", parallel = true)
    public static Object [][] concurrencySites(){
        return new Object[][]{
                {"https://1xbetua.com/", "Ставки на спорт онлайн | Букмекерская контора 1XBET.COM"},
                {"https://1xbet.cm/", "Ставки на спорт онлайн"},
                {"https://1xbet888.com/", "1XBET.COM Bookmaker. Online sports betting | 1XBET.COM 博彩公司"},
                {"https://1xirsportkcm.top/", "1XBET.COM Bookmaker. Online sports betting | 1XBET.COM Bookmaker"},
                {"https://1xbet.kz/", "1XBET - Букмекерская контора ᐉ Сделать ставки на спорт онлайн в Казахстане ᐉ 1xbet.kz"}
        };
    }
    @DataProvider(name = "browser-provider", parallel = true)
    public Object[][] provide() throws Exception {
        return new Object[][] {
                {DriverFactory.BrowserType.CHROME, "TABLETS"},
                {DriverFactory.BrowserType.FIREFOX, "MICE"},
                {DriverFactory.BrowserType.OPERA, "LAPTOPS"}};
    }

}
