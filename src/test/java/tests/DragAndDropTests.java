package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTests {
    @Test
    public void dragAndDropTest() {
        DragAndDropPage dragAndDropPage = homePage.clickDragAndDropLink();
        dragAndDropPage.dragAndDrop(0, 1);
        Assert.assertEquals(dragAndDropPage.getRectText(), "A", "Drag and drop didn't work");
    }
}
