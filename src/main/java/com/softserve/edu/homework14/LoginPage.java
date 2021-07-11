package com.softserve.edu.homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private static final Long TIMEOUT = 10L;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit;

    public LoginPage enterEmail(String email) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(emailInput))
                .click();
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public LoginPage enterPassword(String password) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(passwordInput))
                .click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage clickOnSubmitButton() {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(submit))
                .click();
        return this;
    }
}

