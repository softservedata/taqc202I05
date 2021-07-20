package com.softserve.edu.opencart.pages.user.common;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsContainer {

    private WebDriver driver;
    //
    @Getter
    private List<ProductComponent> productComponents;

    public ProductsContainer(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        productComponents = findAllProductComponents();
    }

    // Page Object

    // Functional
    private List<ProductComponent> findAllProductComponents() {
        List<ProductComponent> allProductComponents =  new ArrayList<>();
        for (WebElement e : driver.findElements(By.xpath("//div[@class='product-thumb transition']"))) {
            allProductComponents.add(new ProductComponent(e));
        }
        return allProductComponents;
    }

    // Business Logic

}
