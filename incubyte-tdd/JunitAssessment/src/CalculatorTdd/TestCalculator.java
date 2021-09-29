package CalculatorTdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void returnZeroIfEmpty() {
		assertEquals(0,Calculator.add(""));
	}
	
	@Test
	public void returnNumberIfOnlyOneNumberIsPresent() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void returnSumForTwoNumbersSeparatedByComma() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test()
	public void returnSumForAnyAmountOfNumbers() {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}
	
}
