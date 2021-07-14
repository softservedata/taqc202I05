package com.softserve.edu.homework17;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;


	public class Home17Test {

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

			public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
				//WebDriver driver = new ChromeDriver();
				FirefoxOptions options = new FirefoxOptions();
			    options.addArguments("--headless");
			    driver = new FirefoxDriver(options);
				driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				presentationSleep(); // For Presentation ONLY
				driver.get(BASE_URL);
				presentationSleep(); // For Presentation ONLY
				//
				driver.findElement(By.cssSelector("a[title='My Account']")).click();
				presentationSleep(); // For Presentation ONLY
				//
				driver.findElement(By.linkText("Login")).click();
				presentationSleep(); // For Presentation ONLY
				//
				// /*-
				driver.findElement(By.cssSelector("#input-email")).click();
				driver.findElement(By.cssSelector("#input-email")).clear();
				driver.findElement(By.cssSelector("#input-email")).sendKeys("hahaha@gmail.com");
				String content = driver.findElement(By.cssSelector("#input-email")).getAttribute("value");
				System.out.println("***content email = " + content);
				presentationSleep(); // For Presentation ONLY
				// 
				driver.findElement(By.cssSelector("#input-password")).click();
				driver.findElement(By.cssSelector("#input-password")).clear();
				driver.findElement(By.cssSelector("#input-password")).sendKeys("qwerty");
				content = driver.findElement(By.cssSelector("#input-password")).getAttribute("value");
				System.out.println("content password = " + content);
				presentationSleep(2); // For Presentation ONLY
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
				driver.findElement(By.cssSelector("a[title='My Account']")).click();
				presentationSleep();
				if (driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")).isDisplayed()) {
					System.out.println("Login is true");
				} else {
					System.out.println("Login is false");
				}
				
				
				driver.quit(); // close browser, stop server
			}
			
			
		}

