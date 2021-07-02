package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Rectangle extends Square implements Shape {
    private double shortSideLength;
    private double longSideLength;

    public Rectangle() { this(5, 10); }

    public Rectangle(double sideLength) {
        super(sideLength);
    }

    public Rectangle(double shortSideLength, double longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
    }

    @Override
    public double getArea() {
        return shortSideLength * longSideLength;
    }

    @Override
    public double getPerimeter() { return 2 * (shortSideLength + longSideLength); }

    @Override
    public int compareTo(Shape o) {
        return compare(this.getPerimeter(), o.getPerimeter());
    }

    public static int compare(double x, double y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Rect: P=" + getPerimeter();
    }
}
