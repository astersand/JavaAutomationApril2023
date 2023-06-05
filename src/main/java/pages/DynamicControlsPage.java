package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage {
    private WebDriver driver;
    private By removeButton = By.cssSelector("button[onclick='swapCheckbox()']");
    private By loader = By.id("loading");
    private By message = By.id("message");

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickRemoveButton() {
        driver.findElement(removeButton).click();
    }
    public String getTextMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
        return driver.findElement(message).getText();
    }
}
