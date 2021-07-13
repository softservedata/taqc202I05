package homework16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class LoginWithXpath {
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
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).clear();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("hahaha@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).click();
        driver.findElement(By.xpath("//input[@id='input-password']")).clear();
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("qwerty");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<String> headers = driver.findElements(By.xpath("//h2"))
                .stream().map(WebElement::getText).collect(Collectors.toList());

        List<String> expected = Arrays.asList("My Orders", "My Account", "Newsletter");

        Assert.assertTrue(headers.containsAll(expected),
                "Failed to find required headers. Have you logged in?");
    }
}
