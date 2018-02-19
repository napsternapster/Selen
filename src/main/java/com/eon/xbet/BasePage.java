package com.eon.xbet;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

    public class BasePage {
        public static String PAGE_URL;
        public static String PAGE_TITLE;
        public static WebDriver driver;
        public WebDriverWait wait;

//         public enum Sites {
//                UA,
//                CN,
//                CM,
//                IR,
//                KZ
//            }

        public void loadPage(){
            driver.get(getPAGE_URL());
            assertEquals(driver.getTitle(), getPAGE_TITLE());
        }

        public BasePage(WebDriver driver) {this.driver = driver;}



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

        public static String getPAGE_URL() {return PAGE_URL;}

        public static String getPAGE_TITLE() {return PAGE_TITLE;}

    public boolean isElementPresent(WebElement element) {
        try {
            driver.findElement((By) element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public WebElement getVisibility(By locator, int timeout) {
        WebElement element = null;
        wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }

    public void clickElementWhenClickable(By locator, int timeout) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void scrollToElement(WebElement el) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", el);
        }
    }





}

