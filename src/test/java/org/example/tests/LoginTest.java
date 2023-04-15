package org.example.tests;

import org.example.pages.LoginPage;
import org.example.utils.Driver;
import org.testng.annotations.Test;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginPositive() {
        Driver.getDriver().get("https://rahulshettyacademy.com/loginpagePractise/");

        loginPage.username.sendKeys("rahulshettyacademy");
        loginPage.password.sendKeys("learning");
        loginPage.termChck.click();
        loginPage.signinBtn.click();

    }

}
