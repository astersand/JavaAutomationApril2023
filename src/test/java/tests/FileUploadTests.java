package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {
    @Test
    public void successfulFileUploadTest() {
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.selectFile("C:\\Users\\QA1.5\\IdeaProjects\\AutomationApril2023\\src\\main\\resources\\chromedriver.exe");
        fileUploadPage.clickUpload();
        Assert.assertEquals(fileUploadPage.getUploadedFileText(),
                "chromedriver.exe",
                "File was not uploaded successfully");
    }
}
