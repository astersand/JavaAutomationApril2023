package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By upload = By.id("file-submit");
    private By uploadedFilesText = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFile(String filePath) {
        driver.findElement(chooseFile).sendKeys(filePath);
    }
    public void clickUpload() {
        driver.findElement(upload).click();
    }
    public String getUploadedFileText() {
        return driver.findElement(uploadedFilesText).getText();
    }
}
