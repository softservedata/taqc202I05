package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Square implements Shape {
    private final double sideLength;

    public Square() { this(new Line().getLength()); }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(getSideLength(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public int compareTo(Shape o) {
        return Rectangle.compare(this.getPerimeter(), o.getPerimeter());
    }

    @Override
    public String toString() {
        return "Square: P=" + getPerimeter();
    }

}
