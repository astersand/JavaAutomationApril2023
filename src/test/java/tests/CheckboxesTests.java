package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxesTests extends BaseTests {
    @Test
    public void checkCheckboxesTest() {
        CheckboxPage checkboxPage = homePage.clickCheckboxesLink();
        checkboxPage.clickCheckboxByIndexJs(0);
        Assert.assertTrue(checkboxPage.isChecked(0), "checkbox is not checked");
    }
}
