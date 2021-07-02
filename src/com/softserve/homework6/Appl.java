package com.softserve.homework6;

public class Appl {
	public static void main(String[] args) {
		Figure[] figures = { 
				new Rectangle(3, 4), 
				new Rectangle(4.5, 8.2), 
				new Square(4), 
				new Square(5),
				new Square(6) 
				};

		for (Figure current : figures) {
			System.out.println(current.getPerimeter());
		}
	}
}
