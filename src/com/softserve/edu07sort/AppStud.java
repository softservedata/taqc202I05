package com.softserve.edu07sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;

public class AppStud {
	public static void main(String[] args) {
		/*-
		Student[] students = new Student[7];
		students[0] = new Student("Oksana", 26);
		students[1] = new Student("Bogdan", 27);
		students[2] = new Student("Orest", 24);
		students[3] = new Student("Ira", 23);
		students[4] = new Student("Yarko", 21);
		students[5] = new Student("Bogdan", 30);
		students[6] = new Student("Bogdan", 22);
		//
		//String[] students = {"Oksana", "Bogdan", "Orest", "Ira", "Yarko"};
		//
		System.out.println("Original Arrays: " + Arrays.toString(students));
		//
		// Arrays.sort(students);
		// Arrays.sort(students, new Student.ByDestName());
		// Arrays.sort(students, new Student().new ByAge());
		Arrays.sort(students, new Student.ByNameAndAge());
		//
		System.out.println("Sorted Arrays: " + Arrays.toString(students));
		*/
		//
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oksana", 26));
		students.add(new Student("Bogdan", 27));
		students.add(new Student("Orest", 24));
		students.add(new Student("Ira", 23));
		students.add(new Student("Yarko", 21));
		students.add(new Student("Bogdan", 30));
		students.add(new Student("Bogdan", 22));
		//
		System.out.println("Original Arrays: " + students);
		//
		//Collections.sort(students, new Student.ByNameAndAge());
		students.sort(new Student.ByDestName());
		System.out.println("Sorted Arrays: " + students);
	}
}
