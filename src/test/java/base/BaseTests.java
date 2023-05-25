package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private static WebDriver driver;

    public static void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver.get("https://the-internet.herokuapp.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.quit();
    }
    public static void main(String[] args) {

        BaseTests.setUp();
    }
}
