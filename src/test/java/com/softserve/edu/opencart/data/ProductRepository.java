package com.softserve.edu.opencart.data;

public class ProductRepository {
    private static volatile ProductRepository instance = null;

    private ProductRepository() {}

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

    public Unbreakable getDefault() {
        return getDefaultProduct();
    }

    public Unbreakable getDefaultProduct() {
        return Product.get()
                .setMinimumQuantity(1)
                .setRewardPoints(1000)
                .setRating(5)
                .setCategory("Desktop")
                .setSubcategory("PC")
                .setBrand("HP")
                .setModel("Omen")
                .setName("HP - Omen by HP Desktop")
                .setProductCode("hpprod2")
                .setAvailability("In stock")
                .setCurrentPrice("$1100")
                .setLargeGroupPrice("")
                .setDescription("text")
                .setSpecification("")
                .setColor(null)
                .setSize(null)
                .setReviews(null)
                .setRelated(null)
                .build();
    }
}
