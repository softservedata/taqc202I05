package com.softserve.homework6;

public class Appl {

	public static void main(String [] args){
		Figure[] figuresArray = {new Rectangle(5,4),
                new Rectangle(7,10),
                new Square(5.5),
                new Square(6.4),
                new Square (3.5)};
	
	
	
	for (Figure current: figuresArray) {
		System.out.println("Perimeter = " + current.getPerimeter() + " class = " + current.getClass());
	}
	}

	@Override
	public String toString() {
		return "Appl []";
	}
	
	
}
