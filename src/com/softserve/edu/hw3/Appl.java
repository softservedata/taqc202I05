package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        System.out.println("Enter several numbers devided by space and press enter");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        String[] stringsArray = inputLine.split(" ");

        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }

        Arrays.sort(intArray);
        System.out.println("Sorted numbers:" + Arrays.toString(intArray));
    }
}
