package com.softserve.edu.opencart.pages.user;

import com.softserve.edu.opencart.pages.user.common.ProductComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.softserve.edu.opencart.pages.user.common.ProductsContainer;
import com.softserve.edu.opencart.pages.user.common.TopPart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends TopPart {
    private static final String HOME_PAGE_URL = "http://taqc-opencart.epizy.com/";

    private ProductsContainer productsContainer;

    private WebElement searchTextField;
    private WebElement searchButton;
    private WebElement searchSubmitBtn;
    
    public HomePage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        driver.get(HOME_PAGE_URL);
        productsContainer = new ProductsContainer(driver);
        searchTextField = driver.findElement(By.name("search"));
        searchButton = driver.findElement(By.className("input-group-btn"));
    }

    public void searchForProduct(String name) {
        searchTextField.click();
        searchTextField.clear();
        searchTextField.sendKeys(name);
        searchButton.click();
        searchSubmitBtn = driver.findElement(By.id("button-search"));
        searchSubmitBtn.click();
    }

    // Page Object

    // Functional

    // Business Logic
    public boolean containsElementByName(String name) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.linkText(name)));
        return productsContainer.getProductComponents().size() > 0;
    }

}
