package com.softserve.homework7;

public class Rectangle implements Figure {
	private double width;
	private double length;
	
	  public Rectangle(double length, double width) {
		    super();
	        this.length = length;
	        this.width = width;
	  }

	
	public double getPerimeter() {
		return (width + length)*2;
	}
	
	// Getters and Setters
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}


	//HashCode and Equals
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}*/
	
	public int compareTo(Figure rectangle) {
		return ((Double)this.getPerimeter()).compareTo(rectangle.getPerimeter());
	}

	
	
}
