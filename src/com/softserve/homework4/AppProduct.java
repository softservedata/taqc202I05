package com.softserve.homework4;

import java.util.Arrays;

public class AppProduct {
	public static void main(String[] args) {
		
		Product p1 = new Product("tea cup", 34);
		Product p2 = new Product("tea cup", 11);
		Product p3 = new Product("bottle", 23);
		Product p4 = new Product("coffee cup", 9);
		Product p5 = new Product("plate", 15);
		
		//System.out.println(p1); //в print автоматически используется toString
		/* //
		if (p1 == p2) {
			System.out.println("p1 == p2 true");
		} else {
			System.out.println("p1 == p2 false");
		}
		*/ //
		if (p1.equals(p2)) {
			System.out.println("p1 equals p2 true");
		} else {
			System.out.println("p1 equals p2 false");
		}
		
		Product[] products = {p1, p2, p3, p4, p5};
		
		double maxPrice  = products[0].getPrice();
		Product maxPriceproduct = products[0];
		
		for (Product current : products) {
			double currentPrice = current.getPrice();
			if (maxPrice < currentPrice) {
				maxPrice = currentPrice;
				maxPriceproduct = current;
			}
		}
		
		System.out.print("Product with max price: ");
		System.out.print(maxPriceproduct);	
		}		
			}


