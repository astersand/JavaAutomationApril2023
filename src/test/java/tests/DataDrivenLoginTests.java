package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.DataUtil;

import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class DataDrivenLoginTests extends BaseTests {
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider")
    public void testSuccessfullLogin(HashMap<String, String> hashMap) {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is wrong");
    }
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider2")
    public void testWrongPasswordLogin(HashMap<String, String> hashMap) {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoginPageAlertText().contains("Your password is invalid!"), "Alert text is wrong");
    }
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider3")
    public void testWrongUsernameLogin(HashMap<String, String> hashMap) {
        LoginPage loginPage = homePage.clickFormsAuthentication();
        loginPage.setUsername(hashMap.get("username"));
        loginPage.setPassword(hashMap.get("password"));
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoginPageAlertText().contains("Your username is invalid!"), "Alert text is wrong");
    }
}
