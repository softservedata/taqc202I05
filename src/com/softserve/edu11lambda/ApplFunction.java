package com.softserve.edu11lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplFunction {
	public static void main(String[] args) {
		Predicate<String> predicate1 = s -> s.length() > 1;
		//
		//List<String> names = Arrays.asList(new String[] {"Angela", "Aaron", "Bob", "Claire", "David"});
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David", "A");
		//
		//Predicate<String> predicate = name -> name.startsWith("A");
		//
		//System.out.println("Origin: " + names);
		System.out.println("Origin: ");
		names.forEach(System.out::println);
		/*-
		List<String> namesWithA = names.stream()
				.filter(name -> name.startsWith("A"))
				//.filter(predicate)
				.filter(predicate1)
				.collect(Collectors.toList());
		System.out.println("Modify: " + namesWithA);
		*/
		System.out.println("\nUpdated: ");
		names.stream()
			.filter(name -> name.startsWith("A"))
			.filter(s -> s.length() > 1)
			.forEach(System.out::println);
	}
}
