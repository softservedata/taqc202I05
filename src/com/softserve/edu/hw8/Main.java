package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 2);
        List<Integer> b = Arrays.asList(1, 2, 3, 1, 3);

        System.out.println("Is content the same? " + a.containsAll(b));
    }
}
