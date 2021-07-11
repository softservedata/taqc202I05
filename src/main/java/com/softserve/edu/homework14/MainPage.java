package com.softserve.edu.homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private static final Long TIMEOUT = 10L;
    private WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    private WebElement loginLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }

    public MainPage clickOnMyAccountLink() {
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        myAccountLink.click();
        return this;
    }

    public MainPage clickOnLoginLink() {
        new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(loginLink))
                .click();
        return this;
    }
}
