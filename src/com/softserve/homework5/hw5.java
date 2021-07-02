package com.softserve.homework5;

import java.util.Arrays;

import com.softserve.homework4.Product;

public class hw5 {
	public static void main(String[] args) {
		Product[] prods = new Product[10];
		prods[0] = new Product("pen", 1.2);
		prods[1] = new Product("pencil", 4);
		prods[2] = new Product("sketchbook", 12.55);
		prods[3] = new Product("sheets", 10.7);
		prods[4] = new Product("eraser", 3.15);
		prods[5] = new Product("diary", 14.9);
		prods[6] = new Product("diary", 8.9);
		prods[7] = new Product("ruler", 2);
		prods[8] = new Product("pen kit", 7.45);
		prods[9] = new Product("paint", 10);
		
		//System.out.println(prods.length);
		//System.out.println(Arrays.toString(prods)); //печатаем содержимое массива
		
		double minPrice  = prods[0].getPrice();
		Product minPriceproduct = prods[0];
		for (Product current : prods) {
			double currentPrice = current.getPrice();
			if (minPrice > currentPrice) {
				minPrice = currentPrice;
				minPriceproduct = current;
			}
		}
		System.out.println(minPriceproduct);
	}
}
