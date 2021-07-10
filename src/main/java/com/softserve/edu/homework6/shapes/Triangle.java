package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Triangle extends Rectangle implements Shape {
    private final double base;
    private final double height;

    public Triangle() { this(10, 3); }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
