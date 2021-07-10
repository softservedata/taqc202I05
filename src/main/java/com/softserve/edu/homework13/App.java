package com.softserve.edu.homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class App {
    private static final String URL = "http://taqc-opencart.epizy.com/";
    private static final Long TIMEOUT = 10L;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // open URL in browser
        driver.get(URL);
        // choose currency - Euro
        driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.findElement(By.xpath("//button[@name='EUR']")).click();
        // Enter 'iPhone' in search field
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone");
        // Click serch button
        driver.findElement(By.xpath("//span[@class='input-group-btn']//button[@type='button']")).click();
        // Check if iPhone XR with price 707.71 Euro is present on the page
        List<WebElement> goods = driver.findElements(By.xpath("//div[@class='caption']//h4//a"));
        for (String name : goods.stream().map(WebElement::getText).collect(Collectors.toList())) {
            if (name.equalsIgnoreCase("iphone xr")) {
                System.out.print("Found " + name);
                String price = driver.findElement(
                        By.xpath("//div[@class='caption']/h4/a[contains(text(),'iPhone XR')]//following::p[@class='price']"))
                        .getText().trim();
                if (price.startsWith("707.71\u20AC")) {
                    System.out.print(" with price: " + price);
                }
            }
        }
    }
}
