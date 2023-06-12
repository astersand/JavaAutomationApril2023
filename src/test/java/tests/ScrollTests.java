package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class ScrollTests extends BaseTests {
    @Test
    public void testScrollToTable() {
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDomPage();
        largeAndDeepDomPage.scrollToTable();
    }
}
