package com.softserve.edu.homework19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CheckProductPresentOnMainPage {

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
//        WebDriverManager.firefoxdriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);

//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("--headless");
//        driver = new FirefoxDriver(firefoxOptions);

//        driver = new ChromeDriver();
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
    public void checkIphonePresentOnTabComponent(){
        HomePageComponent homePageComponent = new HomePageComponent(driver);

        homePageComponent.featuredField().isDisplayed();

        Actions actions = new Actions(driver);
        actions.moveToElement(homePageComponent.iphone3Card());
        actions.perform();

        homePageComponent
                .iphone3Card().isDisplayed();
    }

}
