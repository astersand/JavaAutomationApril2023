package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private By alertMessage = By.id("flash");
    private WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText() {
        return driver.findElement(alertMessage).getText();
    }
}
