package com.softserve.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        int v1;
        int v2;
        int v3;
        Scanner value1 = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        v1 = value1.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.print("Enter 2nd value: ");
        v2 = value2.nextInt();

        Scanner value3 = new Scanner(System.in);
        System.out.print("Enter 3rd value: ");
        v3 = value3.nextInt();

        int[] num = {v1, v2, v3};
        Arrays.sort(num);
        System.out.println("Sorted: " + Arrays.toString(num));
    }
}
