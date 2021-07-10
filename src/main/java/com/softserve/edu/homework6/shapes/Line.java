package com.softserve.edu.homework6.shapes;

import com.softserve.edu.homework6.Shape;

public class Line implements Shape {
    private final Point start;
    private final Point end;
    private final double length;

    public Line() { this(new Point(0, 0), new Point(0, 10)); }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        length = Math.sqrt((Math.pow((start.getX() - end.getX()), 2) + Math.pow((start.getY() - end.getY()), 2)));
    }

    public double getLength() { return length; }

    @Override
    public double getArea() { return getLength(); }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Shape o) {
        return 0;
    }
}
