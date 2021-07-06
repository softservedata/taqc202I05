package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTest {
	private final String BASE_URL = "http://taqc-opencart.epizy.com/";
	private final Long IMPLICITLY_WAIT_SECONDS = 10L;
	private final Long ONE_SECOND_DELAY = 1000L;
	private WebDriver driver;

	private void presentationSleep() {
		presentationSleep(1);
	}

	private void presentationSleep(int seconds) {
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
			// takeScreenShot(testName);
			// takePageSource(testName);
			// driver.manage().deleteAllCookies(); // clear cache; delete cookie; delete
			// session;
		}
		// driver.findElement(By.cssSelector("#logo .img-responsive")).click();
		// driver.findElement(By.cssSelector("#logo > a")).click();
		driver.findElement(By.xpath("//img[contains(@src, '/logo.png')]/..")).click();
		presentationSleep(); // For Presentation ONLY
	}

	@Test
	public void checkWebElements() throws Exception {
    	//
		driver.findElement(By.cssSelector("a[title='My Account']")).click();
		presentationSleep(); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector("a[href*='route=account/login']")).click();
		presentationSleep(); // For Presentation ONLY
		//
		// Search Web Elements
		//WebElement login = driver.findElement(By.id("input-email"));
		//WebElement login = driver.findElement(By.name("email"));
		//WebElement login = driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']"));
		/*-
		List<WebElement> elements = driver.findElements(By.className("fform-control"));
		if (elements.size() == 0) {
			throw new RuntimeException("Element(s) not found");
		}
		WebElement login = null;
		for (WebElement element : elements) {
			if (element.getAttribute("placeholder").contains("E-Mail Address")) {
				login = element;
				break;
			}
		}
		if (login == null) {
			throw new RuntimeException("Element(s) not found");
		}
		*/
		//
		WebElement login = (WebElement) ((JavascriptExecutor)driver).executeScript("return document.getElementById('input-email')");
		//
		login.sendKeys("hahaha");
		presentationSleep(); // For Presentation ONLY
		//
		Assert.assertTrue(login.getAttribute("value").contains("hahaha"));
		presentationSleep(); // For Presentation ONLY
		//
		((JavascriptExecutor)driver).executeScript("alert('Hello, click OK')");
		presentationSleep(4); // For Presentation ONLY
		driver.switchTo().alert().accept( );
		presentationSleep(); // For Presentation ONLY
		//
	}
}
