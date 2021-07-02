package com.softserve.homework6;

public abstract class Figure {
	protected double width;
	protected double length;
	public abstract double getPerimeter();
	public double getWidth() {
		return width;
	}
	protected Figure() {
		System.out.println("Figure Constructor");
	}
	
	// toString
	@Override
	public String toString() {
		return "Figure [width=" + width + ", length=" + length + "]";
	}
	
	 /* // Equals, HashCode
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
		Figure other = (Figure) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	*/
	
	
}
