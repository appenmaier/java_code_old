package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
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

  private BMICalculator calculator;

  public BMICalculatorTest() throws InvalidSizeException {
    calculator = new BMICalculator(1.8, 85);
  }

  @Test
  public void testConstructor() {
    assertThrows(InvalidSizeException.class, () -> new BMICalculator(0, 85));
  }

  @Test
  public void testGetBmi() {
    double actualBmi = calculator.getBmi();
    double expectedBmi = 26.2345679012345679;
    assertEquals(expectedBmi, actualBmi);
  }

  @Test
  public void testGetBmiCategory() {
    assertEquals("Uebergewicht", calculator.getBmiCategory());
  }

}
