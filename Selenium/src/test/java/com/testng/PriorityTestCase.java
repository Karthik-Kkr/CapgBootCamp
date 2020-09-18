package com.testng;

import org.testng.annotations.Test;

public class PriorityTestCase {
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("TestCase 1");
	}

	@Test(priority = 3)
	public void testCase2() {
		System.out.println("TestCase 2");
	}
	
	@Test(priority = 1)
	public void testCase3() {
		System.out.println("TestCase 3");
	}
}
