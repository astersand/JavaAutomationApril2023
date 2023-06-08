package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formsAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By checkboxesLink = By.linkText("Checkboxes");
    private By hoversLink = By.linkText("Hovers");
    private By dragAndDropLink = By.linkText("Drag and Drop");
    private By dynamicControlsLink = By.linkText("Dynamic Controls");
    private By alertsLink = By.linkText("JavaScript Alerts");
    private By fileUploadLink = By.linkText("File Upload");
    private By textEditorLink = By.linkText("WYSIWYG Editor");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormsAuthentication() {
        driver.findElement(formsAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }
    public CheckboxPage clickCheckboxesLink() {
        driver.findElement(checkboxesLink).click();
        return new CheckboxPage(driver);
    }
    public HoversPage clickHoversLink() {
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }
    public DragAndDropPage clickDragAndDropLink() {
        driver.findElement(dragAndDropLink).click();
        return new DragAndDropPage(driver);
    }
    public DynamicControlsPage clickDynamicControlsLink() {
        driver.findElement(dynamicControlsLink).click();
        return new DynamicControlsPage(driver);
    }
    public AlertsPage clickAlertsLink() {
        driver.findElement(alertsLink).click();
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }
    public TextEditorPage clickTextEditorLink() {
        driver.findElement(textEditorLink).click();
        return new TextEditorPage(driver);
    }
}
