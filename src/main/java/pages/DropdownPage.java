package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropdown(String option) {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(option);
    }
    public String getSelectedOption() {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        return selectedOptions.get(0).getText();
    }
}
