package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTests {
    @Test
    public void acceptAlertTest() {
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.clickButtonByName("Click for JS Alert");
        Assert.assertEquals(alertsPage.getAlertText(),
                "I am a JS Alert",
                "Wrong JS Alert text");
        alertsPage.acceptAlert();
    }
    @Test
    public void dismissAlertTest() {
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.clickButtonByName("Click for JS Confirm");
        alertsPage.dismissAlert();
        Assert.assertEquals(alertsPage.getResultText(),
                "You clicked: Cancel",
                "Alert was not dismissed");
    }
    @Test
    public void setAlertTextTest() {
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.clickButtonByName("Click for JS Prompt");
        alertsPage.setAlertText("Ovo je prosledjen tekst");
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.getResultText(),
                "You entered: Ovo je prosledjen tekst",
                "Entered text is incorrect");
    }
}
