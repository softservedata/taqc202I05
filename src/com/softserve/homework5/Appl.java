package com.softserve.homework5;

import java.util.Arrays;

import com.softserve.homework4.Product;
import com.softserve.homework4.Subject;

public class Appl {
	public static void main(String[] args) {
		Subject[] prods = { 
				new Product("pen", 2),
				new Product("pencil", 4),
				new Product("sketchbook", 12),
				new Product("sheets", 10),
				new Product("eraser", 3),
				new Product("diary", 14),
				new Product("diary", 8),
				new Product("ruler", 2),
				new Product("pen kit", 7),
				new Product("paint", 10), 
				};

		// System.out.println(Arrays.toString(prods)); //печатаем содержимое массива

		// печатаем список Subject
		System.out.println("Products:");
		for (Subject current : prods) {
			System.out.println(current);
		}
		//сортируем
		Arrays.sort(prods);
		Subject first = prods[0];
		System.out.println("Min price:");
		for (Subject current : prods) {
			if (first.compareTo(current) != 0) {
				break;
			}
			System.out.println(current);
		}

		/*
		 * double minPrice = prods[0].getPrice(); Product minPriceproduct = prods[0];
		 * for (Product current : prods) { double currentPrice = current.getPrice(); if
		 * (minPrice > currentPrice) { minPrice = currentPrice; minPriceproduct =
		 * current; } }
		 */
		// System.out.println("Product with min price is" + minPriceproduct);
	}
}
