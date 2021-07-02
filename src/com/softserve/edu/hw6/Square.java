package com.softserve.edu.hw6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Figure {
    double a;

    @Override
    public double countPerimeter() {
        return 4*a;
    }
}
