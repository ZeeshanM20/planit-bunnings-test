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

  @Test
  public void logInWithEmptyEmailAndPassword() {
    var loginPage = open(HomePage.class).clickSigninmenu().clickSigninbutton().clickSignIn();
    var loginError = loginPage.getDetailsError();
    var emailError = loginPage.getEmailError();
    var passwordError = loginPage.getPasswordError();

    assertEquals("Please correct the highlighted errors", loginError);
    assertEquals("This field is required", emailError);
    assertEquals("This field is required", passwordError);
  }

  @Test
  public void logInWithEmptyPassword() {
    var loginPage = open(HomePage.class).clickSigninmenu().clickSigninbutton().setEmail("xyz").clickSignIn();
    var loginError = loginPage.getDetailsError();
    var passwordError = loginPage.getPasswordErrorWithPasswordButNoEmail();

    assertEquals("Please correct the highlighted errors", loginError);
    assertEquals("This field is required", passwordError);
  }

  @Test
  public void logInWithEmptyEmail() {
    var loginPage = open(HomePage.class).clickSigninmenu().clickSigninbutton().setPassword("12345").clickSignIn();
    var loginError = loginPage.getDetailsError();
    var emailError = loginPage.getEmailError();

    assertEquals("Please correct the highlighted errors", loginError);
    assertEquals("This field is required", emailError);
  }
}
