package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By avatar = By.className("figure");
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    public void hoverOverAvatarByIndex(int index) {
        WebElement selectedAvatar = findAvatarByIndex(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedAvatar).perform();
    }
    private WebElement findAvatarByIndex(int index) {
        List<WebElement> avatarList = driver.findElements(avatar);
        return avatarList.get(index);
    }

    public String getTitle(int index) {
        WebElement selectedAvatar = findAvatarByIndex(index);
        return selectedAvatar.findElement(By.tagName("h5")).getText();
    }

    public String getLinkText(int index) {
        WebElement selectedAvatar = findAvatarByIndex(index);
        return selectedAvatar.findElement(By.tagName("a")).getAttribute("href");
    }
}
