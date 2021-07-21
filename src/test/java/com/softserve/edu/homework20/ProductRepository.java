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
                .setIBrand("HP")
                .setIName("Laptop")
                .setIProductCode("Product 330780")
                .setIRewardPoints("340")
                .setIAvailability("In Stock")
                .setIPrice("215.00€")
                .build();
    }

}
