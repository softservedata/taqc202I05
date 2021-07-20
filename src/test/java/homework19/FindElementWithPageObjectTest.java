package homework19;

import com.softserve.edu.opencart.pages.user.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;

public class FindElementWithPageObjectTest {
    private WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void testFindElementOnPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Failed to find 3",
                homePage.containsElementByName("iPhone 3"));
        homePage.searchForProduct("iPhone 3");
        Assert.assertTrue("Required product was not found",
                homePage.containsElementByName("iPhone 3"));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
