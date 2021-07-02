package com.softserve.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test; // JUnit 4

//import junit.framework.Assert; // JUnit 3

public class CalcTest {
	private static Calc calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
		calc = new Calc();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("\t@Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\t@After");
	}

	@Test
	public void testAdd() {
		System.out.println("\t\t@Test testAdd()");
		/*-
		int i = 0;
		i = 10 / i;
		System.out.println("i = " + i);
		*/
		/*-
		int i = 0;
		if (i == 0) {
			throw new RuntimeException("hahaha");
		}
		*/
//		try {
		Assert.assertEquals(4, 2 + 2 + 1);
//		} catch (Throwable e) {
//			System.out.println("\t\t\terror");
//		}
		// fail("Not yet implemented");
	}

	@Test
	public void testAdd1() {
		System.out.println("\t\t@Test testAdd1()");
		// Calc calc = new Calc();
		double actual;
		double expected;
		//
		actual = calc.add(4, 4);
		expected = 8.001;
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testAdd2() {
		System.out.println("\t\t@Test testAdd2()");
		// Calc calc = new Calc();
		double actual;
		double expected;
		//
		actual = calc.add(4, 5);
		expected = 9;
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDiv1() {
		System.out.println("\t\t@Test testDiv1()");
		// Calc calc = new Calc();
		double actual;
		double expected;
		//
		actual = calc.div(20, 5);
		expected = 4;
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDiv2() {
		System.out.println("\t\t@Test testDiv2()");
		// Calc calc = new Calc();
		double actual;
		double expected;
		//
		actual = calc.div(20, 8);
		expected = 2.5;
		Assert.assertEquals(expected, actual, 0.01);
	}

}
