package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import helpers.SimpleCalculator;

/**
 * Testklasse fuer helpers.SimpleCalculator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SimpleCalculatorTest {

	private static SimpleCalculator simpleCalculator;

	@BeforeAll
	static void setUp() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test
	@DisplayName("Multiplication with Zero")
	void multiply_withZero_Zero() {
		assertEquals(0, simpleCalculator.multiply(0, 5));
		assertEquals(0, simpleCalculator.multiply(5, 0));
	}

	@ParameterizedTest
	@DisplayName("Absolute Values of positive and negative Values")
	@ValueSource(ints = { -1, 0, 1 })
	void abs_positiveAndNegativeValues_AbsoluteValues(int a) {
		assertTrue(simpleCalculator.abs(a) >= 0);
	}

	@Test
	@DisplayName("Division by Zero")
	void divide_byZero_ArithmeticException() {
		assertThrows(ArithmeticException.class, () -> simpleCalculator.divide(5, 0));
	}

}
