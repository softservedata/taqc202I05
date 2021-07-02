package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Прочитати з клавіатури три числа (цілих або дійсних).
Вивести ці числа на екран у порядку зростання.

*/

public class Appl {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter the second number: ");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.print("Enter the third number: ");
        int number3 = Integer.parseInt(reader.readLine());

        if (number1 <= number2 && number1 <= number3) {
            if (number2 <= number3) {
                System.out.println("Ascending order: " + number1 + " " + number2 + " " + number3);
            } else {
                System.out.println("Ascending order: " + number1 + " " + number3 + " " + number2);
            }
        } else if (number2 <= number1 && number2 <= number3) {
            if (number1 <= number3) {
                System.out.println("Ascending order: " + number2 + " " + number1 + " " + number3);
            } else {
                System.out.println("Ascending order: " + number2 + " " + number3 + " " + number1);
            }
        } else {
            if (number1 <= number2) {
                System.out.println("Ascending order: " + number3 + " " + number1 + " " + number2);
            } else {
                System.out.println("Ascending order: " + number3 + " " + number2 + " " + number1);
            }
        }
    }
}
