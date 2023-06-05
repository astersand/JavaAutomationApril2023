package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {
    private static WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
 }
