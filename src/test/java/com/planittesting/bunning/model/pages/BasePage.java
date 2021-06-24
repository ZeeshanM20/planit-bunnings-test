package com.planittesting.bunning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartCount() {
        if (driver.findElements(By.className("cartItemCount")).size() == 0) {
            return null;
        }
        return driver.findElement(By.className("cartItemCount")).getText();
    }

    public HomePage clickSigninmenu() {
        driver.findElement(By.id("icon-account")).click();
        return new HomePage(driver);
    }

    public LoginPage clickSigninbutton() {
        driver.findElement(By.className("WtNgf")).click();
        return new LoginPage(driver);
    }
}
