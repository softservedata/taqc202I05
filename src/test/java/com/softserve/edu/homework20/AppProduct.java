package com.softserve.edu.homework20;

public class AppProduct {

    public static void main(String[] args) {

        Product product = Product
                .get()
                .setIBrand("Apple")
                .setIName("MacBook")
                .setIProductCode("Product 16")
                .setIRewardPoints("600")
                .setIAvailability("In Stock")
                .setIPrice("392.30€")
                .build();

        System.out.println(product.toString());
        System.out.println("|||||||||||||||||||||||||||");

        Product product1 = ProductRepository.get().getDefaultProduct();
        System.out.println(product1);
    }


}
