package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTests {
    private static WebDriver driver;
    protected HomePage homePage;
    private String screenshotPath;
    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        this.goHome();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }
    private void takeScreenshot(ITestResult result) {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        screenshotPath = "C:\\Users\\QA1.5\\IdeaProjects\\AutomationApril2023\\src\\main\\resources\\screenshots\\" + result.getName() + ".png";
        try {
            Files.move(screenshot, new File(screenshotPath));
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    @AfterMethod
    public void insertScreenshotIntoReport(ITestResult result) {
        Reporter.setCurrentTestResult(result);
        if(ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(result);
            Reporter.log(result.getName() + " has failed");
            Reporter.log("<a target='_blank' href='" + screenshotPath + "' height='400' width='400'>Screenshot</a>");
        } else if(ITestResult.SUCCESS == result.getStatus()) {
            Reporter.log(result.getName() + " has passed");
        } else {
            Reporter.log(result.getName() + " has been skipped");
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
 }
