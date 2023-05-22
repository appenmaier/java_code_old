package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import demos.bmicalculator.BMICalculator;
import demos.bmicalculator.BMICalculator.InvalidSizeException;

/**
 * Testklasse fuer BMICalculator
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class BMICalculatorTest {

  private static BMICalculator calculator;

  @BeforeAll
  public static void setUp() throws InvalidSizeException {
    calculator = new BMICalculator(1.8, 85);
  }

  @Test
  public void testConstructor() {
    assertThrows(InvalidSizeException.class, () -> new BMICalculator(0, 85));
  }

  @Test
  @Disabled("mach ich morgen")
  public void testGetBmi() {
    double actualBmi = calculator.getBmi();
    double expectedBmi = 26.2345679012345679;
    assertEquals(expectedBmi, actualBmi);
  }

  @Test
  @DisplayName("Test getBmiCatgeory() with successful inputs")
  public void testGetBmiCategory() {
    assertEquals("Uebergewicht", calculator.getBmiCategory());
  }

}
