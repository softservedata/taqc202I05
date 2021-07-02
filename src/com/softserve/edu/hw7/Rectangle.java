package com.softserve.edu.hw7;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Rectangle implements Figure {
    double a;
    double b;


    @Override
    public double countPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public int compareTo(Figure o) {
        if (countPerimeter() > o.countPerimeter()) {
            return 1;
        } else if (countPerimeter() < o.countPerimeter()) {
            return -1;
        } else return 0;
    }
}
