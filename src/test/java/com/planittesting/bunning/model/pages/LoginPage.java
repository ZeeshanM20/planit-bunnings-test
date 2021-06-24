package com.planittesting.bunning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage<LoginPage> {

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage setEmail(String email) {
    driver.findElement(By.id("okta-signin-username")).sendKeys(email);
    return this;
  }

  public LoginPage setPassword(String password) {
    driver.findElement(By.id("okta-signin-password")).sendKeys(password);
    return this;
  }

  public LoginPage clickSignIn() {
    driver.findElement(By.id("okta-signin-submit")).click();
    return this;
  }

  public String getDetailsError() {
    return new WebDriverWait(driver, 30).until(d -> d.findElement(By.className("infobox-error")).getText());

  }

}
