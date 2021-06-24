package com.planittesting.bunning.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.bunning.model.pages.BasePage;
import com.planittesting.bunning.model.pages.ContactPage;
import com.planittesting.bunning.model.pages.HomePage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ContactTests extends BaseTest {
    
    @Test
    public void validateErrorMessage(){
        var detailsError = open(ContactPage.class)
            .setEmail("sddsfs")
            .setPassword("sdf")
            .clickSignin()
            .getdetailsError();       
            assertEquals("Your email address or password is incorrect.", detailsError);

    }
    
}
