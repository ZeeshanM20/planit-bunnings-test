package com.planittesting.bunning.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.bunning.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

  @Test
  public void logInWithInvalidCredentials() {
    var error = open(HomePage.class).clickSigninmenu().clickSigninbutton().setEmail("xyz").setPassword("12345")
        .clickSignIn().getDetailsError();

    assertEquals("Your email address or password is incorrect.", error);
  }
}
