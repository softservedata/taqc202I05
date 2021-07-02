package com.softserve.edu03;

import java.util.Scanner;

public class Appl {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
    System.out.print("Input first number: ");
    int first_num = in.nextInt();
    System.out.print("Input second number: ");
    int second_num = in.nextInt();
    System.out.print("Input third number: ");
    int third_num = in.nextInt();
    
    System.out.printf("Numbers: %d > %d > %d", first_num, second_num, third_num);
    in.close();
}
}
