package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {
    private WebDriver driver;
    public CheckboxPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickCheckboxByIndex(int index) {
        WebElement checkbox = this.findCheckboxByIndex(index);
        checkbox.click();
    }
    public void clickCheckboxByIndexJs(int index) {
        WebElement checkbox = this.findCheckboxByIndex(index);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkbox);
    }
    public boolean isChecked(int index) {
        WebElement selectedCheckbox = this.findCheckboxByIndex(index);
        return selectedCheckbox.isSelected();
    }

    private WebElement findCheckboxByIndex(int index){
        List<WebElement> checkboxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
        return checkboxList.get(index);
    }
}
