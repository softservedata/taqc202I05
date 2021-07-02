package com.softserve.homework7;
//dev > homework04+

import java.util.Arrays;

public class Appl {
	public static void main(String[] args) {

		Figure[] figures = { 
				new Rectangle(10, 12),
				new Rectangle(3, 4),
				new Rectangle(4, 8),
				new Square(4),
				new Square(5),
				new Square(6) 
				};
		
		//
		System.out.println("Original array:");
		for (Figure figure : figures) {
			System.out.println(figure.getPerimeter());
		}
		//
		Arrays.sort(figures); // так не надо сортировать объекты, джава не отслеживает может она посортировать
								// или нет, будет ошибка в runtime.
		// System.out.println("\nSorted Array: " + Arrays.toString(figures));
		//
		System.out.println();
		System.out.println("Sorted Array: ");
		for (Figure figure : figures) {
			System.out.println(figure.getPerimeter());
		}
	}
}
