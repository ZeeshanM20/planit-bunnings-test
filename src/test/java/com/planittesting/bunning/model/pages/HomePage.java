package com.planittesting.bunning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage<HomePage> {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public HomePage addItemToCart() {
    driver.findElement(By.className("Buttonstyle__PrimaryProductButton-sc-1af200m-1")).click();
    return this;
  }

}
