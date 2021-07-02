package com.softserve.homework6;

public class Rectangle implements Figure {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("Rectangle Constructor");
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getPerimeter() {
		System.out.print("the perimeter of rectangle is: ");
		return length * 2 + width * 2;
	}

	@Override
	public String toString() {
		return "Rectangle length is " + length + "and width is " + width + " cm";
	}
}
