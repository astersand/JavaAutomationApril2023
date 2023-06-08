package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TextEditorPage {
    private WebDriver driver;
    private By textEditor = By.id("tinymce");
    private By boldButton = By.cssSelector("button[title='Bold']");
    private String frameId = "mce_0_ifr";
    private By navigation = By.cssSelector("div[role='navigation']");
    public TextEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clear() {
        var frame = this.findFrameById(frameId);
        frame.findElement(textEditor).clear();
        driver.switchTo().defaultContent();
    }
    public void setValue(String value) {
        var frame = this.findFrameById(frameId);
        frame.findElement(textEditor).sendKeys(value);
        driver.switchTo().defaultContent();
    }
    public void boldClick() {
        this.selectAllText();
        driver.findElement(boldButton).click();
    }
    private void selectAllText() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.CONTROL + "a").perform();
    }
    private WebDriver findFrameById(String frameId) {
        return driver.switchTo().frame(frameId);
    }
    public String getNavigationText() {
        return driver.findElement(navigation).getText();
    }
}
