package com.eon.aqa.qa.data;

import org.testng.annotations.DataProvider;

public class RegistrationData {

    @DataProvider(name = "signup")
    public static Object[][] signup(){
        return new Object[][]{
                {"QA", "Denis", "aqa.denis.karlinsky@gmail.com", "123123"},
                {"", "3123123", "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт."}

        };
    }

}
