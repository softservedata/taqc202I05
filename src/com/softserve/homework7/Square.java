package com.softserve.homework7;

public class Square implements Figure {
	private int length;

	public Square(int length) {
		this.length = length;
		//System.out.println("Square Constructor");
	}
	
	public Square() {
		length = 0;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPerimeter() {
		return 4 * length;
	}

	public int compareTo(Figure other) {
		return getPerimeter() - other.getPerimeter();
	}
	
	@Override
	public String toString() {
		return "\nSquare length = " + length;
	}
}
