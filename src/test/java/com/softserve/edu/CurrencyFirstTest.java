package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.data.ProductRepository;
import com.softserve.edu.opencart.pages.user.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrencyFirstTest {
    private static final String BASE_URL = "http://taqc-opencart.epizy.com/";
    private static final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final Long ONE_SECOND_DELAY = 1000L;
    private static WebDriver driver;

    private static void presentationSleep() {
        presentationSleep(1);
    }

    private static void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
    }

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        presentationSleep(); // For Presentation ONLY
        // driver.close();
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(BASE_URL);
        presentationSleep(); // For Presentation ONLY
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        presentationSleep(); // For Presentation ONLY
        // logout;
        // Save Screen;
        if (!result.isSuccess()) {
            String testName = result.getName();
            System.out.println("***TC error, name = " + testName + " ERROR");
            // Take Screenshot, save sourceCode, save to log, prepare report, Return to;
            // previous state, logout, etc.
            //takeScreenShot();
            //takePageSource();
            // driver.manage().deleteAllCookies(); // clear cache; delete cookie; delete
            // session;
        }
        // driver.findElement(By.cssSelector("#logo .img-responsive")).click();
        // driver.findElement(By.cssSelector("#logo > a")).click();
        driver.findElement(By.xpath("//img[contains(@src, '/logo.png')]/..")).click();
        presentationSleep(); // For Presentation ONLY
    }

    //@Test
    public void testCurrencyHomePage() {
        // Steps
        HomePage homepage = new HomePage(driver);
        //homepage = homepage.chooseCurrency("Pound Sterling");
        homepage = homepage.chooseCurrency(Currencies.POUND_STERLING);
        presentationSleep(); // For Presentation ONLY
        //homepage = homepage.chooseCurrency("US Dollar");
        homepage = homepage.chooseCurrency(Currencies.US_DOLLAR);
        presentationSleep(); // For Presentation ONLY
        // Check
        System.out.println("Actual: " + homepage.getCurrencyText());
        System.out.println("Expected: " + "$");
        presentationSleep(); // For Presentation ONLY
        Assert.assertTrue(homepage.getCurrencyText().contains("$"));
        presentationSleep(); // For Presentation ONLY
    }

    @Test
    public void testMacHomePage() {
        // Steps
        HomePage homepage = new HomePage(driver);
        //homepage = homepage.chooseCurrency("US Dollar");
        homepage = homepage.chooseCurrency(Currencies.US_DOLLAR);
        presentationSleep(); // For Presentation ONLY
        //
        System.out.println(
                "Actual: " + homepage
                .getProductComponentsContainer()
                //.getProductComponentPriceByName("MacBook")
                .getProductComponentPriceByName(ProductRepository.getMacBook())
        );
        System.out.println("Expected: " + "$602.00");
        presentationSleep(); // For Presentation ONLY
        Assert.assertTrue(
                homepage
                .getProductComponentsContainer()
                //.getProductComponentPriceByName("MacBook")
                .getProductComponentPriceByName(ProductRepository.getMacBook())
                .contains("$602.00"));
        presentationSleep(); // For Presentation ONLY
    }

}
