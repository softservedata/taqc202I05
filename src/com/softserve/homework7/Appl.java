package com.softserve.homework7;

public class Appl {

	public static void main(String [] args){
		Figure[] figuresArray = {new Rectangle(5,4),
                new Rectangle(7,10),
                new Square(5.5),
                new Square(6.4),
                new Square (3.5)};
	boolean isSorted = true;
	for(int i=0; i<figuresArray.length-1; i++) {
		if(figuresArray[i].compareTo(figuresArray[i+1]) > 0) {
			isSorted = false;
			break;
		}
	}
	if(isSorted) {
		System.out.println("Array is sorted");
	}
	else System.out.println("Array is not sorted");
	
	for (Figure current: figuresArray) {
		System.out.println("Perimeter = " + current.getPerimeter() + " class = " + current.getClass());
	}
	}
	
	

	@Override
	public String toString() {
		return "Appl []";
	}
	
	
}
