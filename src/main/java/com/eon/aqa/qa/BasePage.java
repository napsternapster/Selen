package com.eon.aqa.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class BasePage {
        public String PAGE_URL;
        public String PAGE_TITLE;
        public WebDriver driver;

        public BasePage(WebDriver driver) {this.driver = driver;}

        public void loadPage(){
            driver.get(getPAGE_URL());
            assertEquals(driver.getTitle(), getPAGE_TITLE());
        }

        public void clickElement(WebElement element){element.click();}

        public void setElementText(WebElement element, String text){
            element.clear();
            element.sendKeys(text);
            assertEquals(element.getAttribute("value"), text);

        }

        public void selectVauleDropdown(WebElement dropdown, String value){
            Select select = new Select(dropdown);
            select.selectByValue(value);
        }

        public String getPAGE_URL() {return PAGE_URL;}

        public String getPAGE_TITLE() {return PAGE_TITLE;}

    public boolean isElementPresent(WebElement element) {
        try {
            driver.findElement((By) element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}

