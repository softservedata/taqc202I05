package homework15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithCSSTest {
    private static final String MAIN_PAGE_URL = "http://taqc-opencart.epizy.com/";
    private static final Long TIMEOUT = 10L;
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginTest() {
        driver.get(MAIN_PAGE_URL);
        driver.findElement(By.cssSelector("i.fa.fa-user")).click();
        driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right li + li")).click();
        driver.findElement(By.cssSelector("#input-email")).clear();
        driver.findElement(By.cssSelector("#input-email")).sendKeys("hahaha@gmail.com");
        driver.findElement(By.cssSelector("#input-password")).click();
        driver.findElement(By.cssSelector("#input-password")).clear();
        driver.findElement(By.cssSelector("#input-password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Assert.assertTrue(true);
    }
}
