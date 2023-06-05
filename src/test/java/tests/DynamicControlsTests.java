package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class DynamicControlsTests extends BaseTests {
    @Test
    public void waitTest() {
        DynamicControlsPage dynamicControlsPage = homePage.clickDynamicControlsLink();
        dynamicControlsPage.clickRemoveButton();
        Assert.assertEquals(dynamicControlsPage.getTextMessage(), "It's gone!", "Wait didn't work");
    }
}
