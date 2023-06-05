package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDropPage {
    private WebDriver driver;
    private By rectangles = By.cssSelector("div[class*='column']");
    private By rectA = By.id("column-a");
    private By rectB = By.id("column-b");
    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop(int sourceIndex, int targetIndex) {
        Actions action = new Actions(driver);
        WebElement source = this.getSourceElement();
        WebElement target = this.getTargetElement();
        action.dragAndDrop(source, target).perform();
    }

    public String getRectText() {
        WebElement selectedRectangle = this.getTargetElement();
        return selectedRectangle.getText();
    }

    private WebElement getSourceElement() {
        return driver.findElement(rectA);
    }
    private WebElement getTargetElement() {
        return driver.findElement(rectB);
    }

}
