package com.softserve.example_hw04;

import java.util.Arrays;

public class Appl {
	public static void main(String[] args) {
		Subject[] arr = {
				new Product("Milk", 40),
				new Product("Coffee", 18),
				new Product("Water", 20),
				new Product("Bread", 18),
				new Product("Beer", 20),
		};
		//
		System.out.println("Products:");
		for (Subject current : arr) {
			System.out.println(current);
		}
		//
		Arrays.sort(arr);
		Subject first = arr[0];
		System.out.println("Min Price:");
		//System.out.println(first);
		for (Subject current : arr) {
			if (first.compareTo(current) != 0) {
				break;
			}
			System.out.println(current);
			//System.out.println(current.getName());
		}
	}
}
