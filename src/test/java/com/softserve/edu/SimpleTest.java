package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {
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
		// System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		//
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		//
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

	// @Test
	public void testSearch() {
		//
		// Choose Curency
		driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
		presentationSleep(); // For Presentation ONLY
		// driver.findElement(By.cssSelector("button[name='USD']")).click();
		driver.findElement(By.name("USD")).click();
		presentationSleep(); // For Presentation ONLY
		//
		// Steps
		// driver.findElement(By.cssSelector("#search > input")).click();
		driver.findElement(By.name("search")).click();
		// driver.findElement(By.cssSelector("#search > input")).clear();
		driver.findElement(By.name("search")).clear();
		// driver.findElement(By.cssSelector("#search > input")).sendKeys("mac");
		driver.findElement(By.name("search")).sendKeys("mac");
		presentationSleep(); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		presentationSleep(); // For Presentation ONLY
		//
		// Check
		WebElement price = driver
				.findElement(By.xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
		Assert.assertTrue(price.getText().contains("$602.00"));
		System.out.println("***contains: " + price.getText());
		presentationSleep(); // For Presentation ONLY
		//
	}

	@Test
	public void checkWebElement() throws Exception {
		//
		driver.findElement(By.cssSelector("a[title='My Account']")).click();
		presentationSleep(); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector("a[href*='route=account/login']")).click();
		presentationSleep(); // For Presentation ONLY
		//
		// /*-
		driver.findElement(By.id("input-email")).click();
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("hahaha");
		String content = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println("***content email = " + content);
		presentationSleep(); // For Presentation ONLY
		//
		// Refresh some webelements
		driver.navigate().refresh();
		presentationSleep(); // For Presentation ONLY
		//
		driver.findElement(By.id("input-email")).sendKeys("bebebe");
		presentationSleep(); // For Presentation ONLY
		// */
		/*-
		WebElement email = driver.findElement(By.id("input-email"));
		//
		email.click();
		email.clear();
		email.sendKeys("hahaha");
		String content = email.getAttribute("value");
		System.out.println("content email = " + content);
		presentationSleep(); // For Presentation ONLY
		//
		// Refresh some webelements
		driver.navigate().refresh();
		presentationSleep(); // For Presentation ONLY
		email.sendKeys("bebebe");
		presentationSleep(); // For Presentation ONLY
		*/
		//
		// driver.findElement(By.id("input-email")).sendKeys("password");
		driver.findElement(By.id("input-password")).click();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("password");
		content = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println("content password = " + content);
		presentationSleep(2); // For Presentation ONLY
		//
	}

}
