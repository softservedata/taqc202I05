package com.softserve.edu.hw6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Figure {
    double a;
    double b;


    @Override
    public double countPerimeter() {
        return 2 * (a + b);
    }
}
