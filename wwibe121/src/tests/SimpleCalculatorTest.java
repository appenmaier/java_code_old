package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import helpers.SimpleCalculator;

/**
 * Testklasse fuer SimpleCalculator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SimpleCalculatorTest {

	@Test
	void testMultiply() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		assertEquals(12, simpleCalculator.multiply(3, 4));
		assertEquals(0, simpleCalculator.multiply(0, 3));
		assertEquals(-4, simpleCalculator.multiply(-1, 4));
	}

}
