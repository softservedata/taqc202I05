package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Point implements Shape {
    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y) { this(x, y, 0); }

    public Point() { this(0, 0, 0); }

    public Point (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() { return x; }

    public double getY() { return y; }

    public double getZ() { return z; }

    public double getArea() { return 1; }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Shape o) {
        return 0;
    }
}
