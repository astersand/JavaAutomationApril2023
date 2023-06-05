package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends BaseTests {

    @Test
    public void checkHoverOnPage() {
        HoversPage hoversPage = homePage.clickHoversLink();
        hoversPage.hoverOverAvatarByIndex(1);
        Assert.assertEquals(hoversPage.getTitle(1), "name: user2", "Title is wrong");
        Assert.assertTrue(hoversPage.getLinkText(1).endsWith("/users/2"), "Href text is wrong");
    }
}
