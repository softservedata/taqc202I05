package com.softserve.edu.homework20;

public class ProductRepository {

    private static volatile ProductRepository instance = null;

    private ProductRepository() {
    }

    public static ProductRepository get() {
        if (instance == null) {
            synchronized (ProductRepository.class) {
                if (instance == null) {
                    instance = new ProductRepository();
                }
            }
        }
        return instance;
    }

    public Product getDefaultProduct() {
        return getProduct();
    }

    public Product getProduct() {

        return  Product
                .get()
                .setIBrand("Apple")
                .setIName("MacBook")
                .setIProductCode("Product 16")
                .setIRewardPoints("600")
                .setIAvailability("In Stock")
                .setIPrice("392.30€")
                .build();
    }

}
