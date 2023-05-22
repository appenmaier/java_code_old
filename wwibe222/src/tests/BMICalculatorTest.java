package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import demos.bmicalculator.BMICalculator;
import demos.bmicalculator.BMICalculator.InvalidSizeException;

/**
 * Testklasse fuer BMICalculator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BMICalculatorTest {

  private static BMICalculator calculator;

  @BeforeAll
  static void setUp() throws InvalidSizeException {
    calculator = new BMICalculator(1.8, 85);
  }

  @Test
  @DisplayName("Konstruktor mit Groesse gleich Null")
  void testConstructor() {
    assertThrows(InvalidSizeException.class, () -> new BMICalculator(0, 85));
  }

  @Test
  @DisplayName("getBMI() mit gueltigen Werten")
  void testGetBmi() {
    assertTrue(Math.abs(calculator.getBmi() - 26.234) <= 0.001);
  }

  @ParameterizedTest
  @ValueSource(doubles = {1.8, 1.7, 1.9})
  void testGetBmi2(double sizeInM) throws InvalidSizeException {
    BMICalculator tmp = new BMICalculator(sizeInM, 85);
    assertTrue(tmp.getBmi() > 0);
  }

  @Test
  @DisplayName("getBmiCatgeory() mit richtiger Kategorie")
  @Disabled("bin noch nicht fertig")
  void testGetBmiCategory() {
    assertEquals("Uebergewicht", calculator.getBmiCategory());
  }

}
