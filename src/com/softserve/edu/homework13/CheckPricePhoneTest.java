package com.softserve.edu.homework13;



import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckPricePhoneTest{

    private static final String BASE_URL = "http://taqc-opencart.epizy.com/";
    private static final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        driver.get(BASE_URL);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After");
    }

    @Test
    public void search() {

        WebElement currency = driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle"));
        WebElement eur = driver.findElement(By.cssSelector("button[name='EUR']"));
        //EUR

        currency.click();
        eur.click();

        driver.findElement(By.cssSelector("#search > input")).click();
        driver.findElement(By.cssSelector("#search > input")).sendKeys("iPhone");

        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

        WebElement price = driver
                .findElement(By.xpath("//a[text()='iPhone XR']/../following-sibling::p[@class='price']"));

        Assert.assertTrue(price.getText().contains("707.71€"));
        System.out.println("***contains: " + price.getText());
    }
}
