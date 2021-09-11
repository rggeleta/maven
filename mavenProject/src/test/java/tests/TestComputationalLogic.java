package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import model.ComputationalLogic;

/**
 * rggeleta@dmacc.edu roman
 * CIS175-Fall2021
 * Sep 8, 2021
 */
public class TestComputationalLogic {

	ComputationalLogic compute = new ComputationalLogic();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
/*
	@Test
	public void testFindAverage() {
		int num1 = 2;
		int num2 = 10;
		int num3 = 3;
		int expectedResult = 5;
		int actualResult = compute.findAverage(num1,num2,num3);
		assertEquals(expectedResult,actualResult,0.01);
		
	}*/
	
	@Test
	public void testFindSum() {
		int num1 = 3;
		int num2 = 10;
		int expectedResult = 13; 
		int actualResult = compute.findSum(num1,num2);
		assertEquals(expectedResult,actualResult,0.01);
		
	}
	
	@Test
	public void testMultiply() {
		int num1 = 3;
		int num2 = 10;
		int expectedResult = 30;
		int actualResult = compute.multiply(num1,num2);
		assertEquals(expectedResult,actualResult,0.01);
		
	}

}
