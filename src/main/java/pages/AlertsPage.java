package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
    private WebDriver driver;
    private By resultText = By.id("result");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonByName(String buttonText) {
        WebElement button = driver.findElement(By.xpath(".//button[text()='" + buttonText + "']"));
        button.click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public void setAlertText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
