package CalculatorTdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void returnZeroIfEmpty() {
		assertEquals(0,Calculator.add(""));
	}
}
