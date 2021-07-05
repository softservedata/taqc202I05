package com.softserve.edu.homework14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LogInTest {

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


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass");
        WebDriverManager.chromedriver().setup();
//         WebDriverManager.firefoxdriver().setup();

//         driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        presentationSleep(); // For Presentation ONLY
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass");
        driver.quit(); // close browser, stop server
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before");
        driver.get(BASE_URL);
        presentationSleep(); // For Presentation ONLY
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After");
    }

    @Test
    public void logInTest() {
        //open the "My account" dropdown menu
        driver.findElement(By.cssSelector("a[title='My Account']")).click();
        presentationSleep(); // For Presentation ONLY

        //choose log in
        driver.findElement(By.cssSelector("a[href*='route=account/login']")).click();
        presentationSleep(); // For Presentation ONLY

        //choose email field and enter password
        driver.findElement(By.id("input-email")).click();
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("hahaha@gmail.com");
        presentationSleep();

        //choose password field and enter password
        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("qwerty");
        presentationSleep();

        //click the "Login" button
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        presentationSleep();

        //check a user is logged in
        WebElement text = driver.findElement(By.cssSelector("div h2"));
        Assert.assertTrue(text.getText().contains("My Account"));
        presentationSleep();
    }

}