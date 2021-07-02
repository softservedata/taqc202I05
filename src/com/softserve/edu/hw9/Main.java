package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 2);
        List<Integer> b = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> c = a.stream()
                .filter(b::contains)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(c);
    }
}
