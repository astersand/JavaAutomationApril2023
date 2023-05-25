package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is wrong");
    }
    @Test
    public void testWrongPasswordLogin() {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecret");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoginPageAlertText().contains("Your password is invalid!"), "Alert text is wrong");
    }
    @Test
    public void testWrongUsernameLogin() {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername("urossimic");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoginPageAlertText().contains("Your username is invalid!"), "Alert text is wrong");
    }
}
