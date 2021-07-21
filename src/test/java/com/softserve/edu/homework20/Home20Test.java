package com.softserve.edu.homework20;

public class Home20Test {

	 public static void main(String[] args) {

	        Product product = Product
	                .get()
	                .setIBrand("HP")
	                .setIName("Laptop")
	                .setIProductCode("Product 330780")
	                .setIRewardPoints("340")
	                .setIAvailability("In Stock")
	                .setIPrice("215.00€")
	                .build();

	        System.out.println(product.toString());
	        System.out.println("|||||||||||||||||||||||||||");

	        Product product1 = ProductRepository.get().getDefaultProduct();
	        System.out.println(product1);
	    }


	}
