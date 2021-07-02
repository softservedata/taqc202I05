package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

/*
* Simple app that reads 3 integer or real numbers as input from user
* and prints them sorted in ascending order. Throws exceptions if smth else is entered
* instead of numbers.
*/
public class Appl {
    private static double x, y, z;

    public static String sort(double ... args) {
        Arrays.sort(args);
        return Arrays.toString(args);
    }

    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number sorting app!");
        System.out.println("Enter first number:");
        x = sc.nextDouble();
        System.out.println("Enter second number:");
        y = sc.nextDouble();
        System.out.println("Enter third number:");
        z = sc.nextDouble();
        System.out.println("Sorting...");
        System.out.println(sort(x, y, z));
        sc.close();
    }
}
