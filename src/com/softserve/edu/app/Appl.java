package com.softserve.edu.app;

import com.softserve.edu.Calc;

public class Appl {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("5 + 5 = " + calc.add(5, 5));
		System.out.println("20 / 5 = " + calc.div(20, 5));
	}
}
