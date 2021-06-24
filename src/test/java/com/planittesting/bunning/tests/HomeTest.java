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

}
