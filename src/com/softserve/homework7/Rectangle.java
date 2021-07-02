package com.softserve.homework7;

public class Rectangle implements Figure {
	private int length, width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		//System.out.println("Rectangle Constructor");
	}
	
	public Rectangle() {
		length = 0;
		width = 0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getPerimeter() {
		return length * 2 + width * 2;
	}
	public int compareTo(Figure other) {
		return getPerimeter() - other.getPerimeter();
	}

	@Override
	public String toString() {
		return "\nRectangle length = " + length + " and width = " + width + " cm";
	}
	
}
