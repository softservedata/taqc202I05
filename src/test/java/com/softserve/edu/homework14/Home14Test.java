package com.softserve.edu.homework14;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home14Test {

		private static final String BASE_URL = "http://taqc-opencart.epizy.com/";
		private static final Long IMPLICITLY_WAIT_SECONDS = 10L;
		private static final Long ONE_SECOND_DELAY = 1000L;

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
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			presentationSleep(); // For Presentation ONLY
			driver.get(BASE_URL);
			presentationSleep(); // For Presentation ONLY
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
			driver.findElement(By.id("input-email")).sendKeys("hahaha@gmail.com");
			String content = driver.findElement(By.id("input-email")).getAttribute("value");
			System.out.println("***content email = " + content);
			presentationSleep(); // For Presentation ONLY
			// 
			driver.findElement(By.id("input-password")).click();
			driver.findElement(By.id("input-password")).clear();
			driver.findElement(By.id("input-password")).sendKeys("qwerty");
			content = driver.findElement(By.id("input-password")).getAttribute("value");
			System.out.println("content password = " + content);
			presentationSleep(2); // For Presentation ONLY
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
			driver.findElement(By.cssSelector("a[title='My Account']")).click();
			presentationSleep();
			if (driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).isDisplayed()) {
				System.out.println("Login is true");
			} else {
				System.out.println("Login is false");
			}
			
			
			driver.quit(); // close browser, stop server
		}
		
		
	}
