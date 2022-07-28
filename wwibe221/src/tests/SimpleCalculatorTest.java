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
 * Testklasse fuer SimpleCalculator
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
	@DisplayName("Multiplication with Zero and simple Multiplication")
	void testMultiply() {
		assertEquals(0, simpleCalculator.multiply(0, 3));
		assertEquals(12, simpleCalculator.multiply(3, 4));
		assertEquals(-4, simpleCalculator.multiply(-1, 4));
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> simpleCalculator.divide(3, 0));
	}

	@ParameterizedTest
	@ValueSource(ints = { -1, 0, 1 })
//	@Disabled("mach ich morgen")
	void testAbs(int a) {
		assertTrue(simpleCalculator.abs(a) >= 0);
	}

}
