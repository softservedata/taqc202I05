package com.softserve.edu.homework6;

import com.softserve.edu.homework6.shapes.Circle;
import com.softserve.edu.homework6.shapes.Rectangle;
import com.softserve.edu.homework6.shapes.Square;
import com.softserve.edu.homework6.shapes.Triangle;

public class Appl {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(),
                new Rectangle(5, 8),
                new Square(4),
                new Square(6),
                new Square(9),
                new Circle(),
                new Circle(4),
                new Triangle(),
                new Triangle(10, Math.PI/2),
        };
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + ": area=" + s.getArea());
        }
    }
}
