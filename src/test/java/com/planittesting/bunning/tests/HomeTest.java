package com.planittesting.bunning.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.bunning.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {

  @Test
  public void addItemToCart() {
    var cartCount = open(HomePage.class).addItemToCart().getCartCount();
    assertEquals("1", cartCount);
  }

  @Test
  public void addSameItemMultipleTimesToCart() {
    var cartCount = open(HomePage.class).addItemToCart().incrementItemQuantityByOne().incrementItemQuantityByOne()
        .getCartCount();
    assertEquals("3", cartCount);
  }

  @Test
  public void removeItemFromCart() {
    var cartCount = open(HomePage.class).addItemToCart().decrementItemQuantityByOne().getCartCount();
    assertEquals(null, cartCount);
  }

  @Test
  public void removeSameItemMultipleTimesFromCart() {
    var cartCount = open(HomePage.class).addItemToCart().incrementItemQuantityByOne().decrementItemQuantityByOne()
        .decrementItemQuantityByOne().getCartCount();
    assertEquals(null, cartCount);
  }
}
