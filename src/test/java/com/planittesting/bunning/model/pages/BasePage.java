package com.planittesting.bunning.model.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
