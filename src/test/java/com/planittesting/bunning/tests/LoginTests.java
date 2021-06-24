package com.planittesting.bunning.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.bunning.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest{

    @Test
    public void validateSuccessfulLogin(){
        var user = open(HomePage.class)
            .clickSigninmenu()
            .clickSigninbutton()
            .setEmail("knightt0258+1@gmail.com")
            .setPassword("Bn77777$")
            .clickSignin()
            .getUser();


        
        assertEquals("x", user);
    }
    
}
