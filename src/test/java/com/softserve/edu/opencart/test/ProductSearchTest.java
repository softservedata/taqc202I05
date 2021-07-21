package com.softserve.edu.opencart.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.SearchProduct;
import com.softserve.edu.opencart.data.SearchProductRepository;
import com.softserve.edu.opencart.pages.user.HomePage;

public class ProductSearchTest extends RemoteTestRunner {

    @DataProvider(parallel = true)
    public Object[][] searchProducts() {
        return new Object[][] { 
            { SearchProductRepository.getMacDollar() },
            { SearchProductRepository.getMacEuro() },
            { SearchProductRepository.getMacPoundSterling() },
        };
    }

    @Test(dataProvider = "searchProducts")
    public void checkFirst(SearchProduct searchProduct) {
        //
        // Steps
        HomePage homePage = loadApplication()
                //.chooseCurrency("US Dollar");
                .chooseCurrency(searchProduct.getCurrency())
                .scrollToProduct(searchProduct.getProduct());
        presentationSleep();
        //
        // Check
        Assert.assertTrue(homePage
                .getProductComponentsContainer()
                //.getProductComponentPriceByName("MacBook")
                .getProductComponentPriceByName(searchProduct.getProduct())
                //.contains("$602.00"));
                .contains(searchProduct.getPrice()));
        //
        presentationSleep();
    }
}
