package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Circle implements Shape {
    private final double radius;

    public Circle() { this(20); }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Shape o) {
        return 0;
    }
}
