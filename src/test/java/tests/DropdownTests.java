package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTests {
    @Test
    public void testDropdownOptions() {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectFromDropdown("Option 2");
        assertEquals(dropdownPage.getSelectedOption(), "Option 2", "wrong option was selected");
    }
}
