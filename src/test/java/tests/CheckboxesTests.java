package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxesTests extends BaseTests {
    @Test
    public void checkCheckboxesTest() {
        CheckboxPage checkboxPage = homePage.clickCheckboxesLink();
        checkboxPage.clickCheckboxByIndex(1);
        Assert.assertFalse(checkboxPage.isChecked(1), "checkbox is not checked");
    }
}
