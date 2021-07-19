package com.softserve.edu.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement iphone3Card() {
        return driver.findElement(By.xpath("//h4/a[text()='iPhone 3']"));
    }

    public WebElement featuredField() {
        return driver.findElement(By.xpath("//h3[text()='Featured']"));
    }

}