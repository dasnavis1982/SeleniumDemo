package com.web.testCases;

import com.web.model.WordPressLoginPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ValidateLoginPage {

    private String labelSiteTitle = "Site Title";
    private String labelUserName = "Username";
    private String labelPassword = "Password";
    private String labelYourEmail = "Your Email";

    WordPressLoginPage wordPress_loginPage = new WordPressLoginPage();

    public ValidateLoginPage() throws IOException {
    }

    @Test
    public void validateLabels(){
//        Assert.assertEquals("labelSiteTitle",);
    }
}
