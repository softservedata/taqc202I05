package com.softserve.homework6;

public class Square implements Figure {
	private double length;

	public Square(double length) {
		this.length = length;
		System.out.println("Square Constructor");
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getPerimeter() {
		System.out.print("the perimeter of square is: ");
		return 4 * length;
	}

	@Override
	public String toString() {
		return "Square length is " + length;
	}
}
