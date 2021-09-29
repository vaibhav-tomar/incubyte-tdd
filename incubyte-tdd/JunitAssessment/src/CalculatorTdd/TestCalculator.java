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
	
	@Test
	public void handleNewLinesBertweenNumbers() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	
	@Test
	public void testCustomDelimeter() {
		assertEquals(6, Calculator.add("//;\n1\n2;3"));
	}
	
	@Test
	public void handleExceptionIfNegativeNumbersFound() {
		try {
			Calculator.add("-1,-2,3");
		}
		catch(Exception exc) {
			assertEquals("negatives not allowed : [-1, -2]", exc.getMessage());
		}
	}
	
}
