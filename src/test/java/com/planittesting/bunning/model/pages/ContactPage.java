package com.planittesting.bunning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage<ContactPage>{

    public ContactPage(WebDriver driver) {
        super(driver);
    }
    
    public ContactPage setEmail(String email) {
        driver.findElement(By.cssSelector("#okta-signin-username")).sendKeys(email);
        return this;
    }

    public ContactPage setPassword(String password) {
        driver.findElement(By.cssSelector("#okta-signin-password")).sendKeys(password);
        return this;
    }

    public ContactPage clickSignin(){
        driver.findElement(By.cssSelector("#okta-signin-submit")).click();
        return this;
    }

    public String getdetailsError(){
       return driver.findElement(By.className("error-16")).getText();
        
    }

    public String getSiginPage() {
        return new WebDriverWait(driver, 30).until(d -> d.findElement(By.className("alert-success"))).getText();
    }
}
