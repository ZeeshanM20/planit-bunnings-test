package com.planittesting.bunning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactPage clickSigninmenu(){
        driver.findElement(By.id("icon-account")).click();
        return new ContactPage(driver);
    }

    public ContactPage clickSigninbutton(){
        driver.findElement(By.cssSelector(".WtNgf")).click();
        return new ContactPage(driver);
    }
}
