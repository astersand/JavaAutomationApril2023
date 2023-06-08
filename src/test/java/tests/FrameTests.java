package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextEditorPage;

public class FrameTests extends BaseTests {
    @Test
    public void setTextBoldTest() {
        TextEditorPage textEditorPage = homePage.clickTextEditorLink();
        textEditorPage.clear();
        textEditorPage.setValue("New text inside frame");
        textEditorPage.boldClick();
        Assert.assertEquals(textEditorPage.getNavigationText(),
                "P\n" +
                        "»\n" +
                        "STRONG",
                "text was not bolded");
    }
}
