package com.softserve.edu.opencart.pages.user.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchSuccessPage extends SearchCriteriaPart {

    WebElement searchCriteriaField;
    WebElement categoriesDropDownMenu;
    WebElement searchInSubcategoriesCheckbox;
    WebElement searchInProductDescriptionsCheckbox;
    WebElement searchBtn;
    WebElement productListViewBtn;
    WebElement productGridViewBtn;
    WebElement sortByDropdownMenu;
    WebElement showCountDropdownMenu;

    public SearchSuccessPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
        searchCriteriaField = driver.findElement(By.cssSelector("#input-search"));
        categoriesDropDownMenu = driver.findElement(By.cssSelector("div.col-sm-3 select"));
        searchInSubcategoriesCheckbox = driver.findElement(By.cssSelector("input[name='sub_category']"));
        searchInProductDescriptionsCheckbox = driver.findElement(By.cssSelector("input#description"));
        searchBtn = driver.findElement(By.cssSelector("input#button-search"));
        productListViewBtn = driver.findElement(By.cssSelector("#list-view"));
        productGridViewBtn = driver.findElement(By.cssSelector("#grid-view"));
        sortByDropdownMenu = driver.findElement(By.cssSelector("#input-sort"));
        showCountDropdownMenu = driver.findElement(By.cssSelector("#input-limit"));
    }

    public void typeSearchTextOntoSearchCriteriaField(String searchText) {
        searchCriteriaField.click();
        searchCriteriaField.clear();
        searchCriteriaField.sendKeys(searchText);
    }

    public void openCloseCategoriesDropDownMenu() {
        categoriesDropDownMenu.click();
    }

    public void selectCategoryOfCategoriesDropDownMenu() {
        //create Enum of options and make a method to choose it
    }

    public void clickSearchInSubcategoriesCheckbox() {
        searchInSubcategoriesCheckbox.click();
    }

    public void clickSearchInProductDescriptionsCheckbox() {
        searchInProductDescriptionsCheckbox.click();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void clickProductListViewBtn(){
        productListViewBtn.click();
    }

    public void clickProductGridViewBtn() {
        productGridViewBtn.click();
    }

    public void openCloseSortByDropdownMenu() {
        sortByDropdownMenu.click();
    }

    public void choseOptionOfSortByDropdownMenu() {
        //create Enum of options and make a method to choose it
    }

    public void openCloseShowCountDropdownMenu() {
        showCountDropdownMenu.click();
    }

    public void choseOptionOfShowCountDropdownMenu() {
        //create Enum of options and make a method to choose it
    }

    // Page Object

    // Functional

    // Business Logic

}

