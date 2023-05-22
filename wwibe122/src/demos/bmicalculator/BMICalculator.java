package demos.bmicalculator;

/**
 * BMI Rechner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BMICalculator {

  @SuppressWarnings("serial")
  public static class InvalidSizeException extends Exception {

  }

  private double sizeInM;
  private double weightInKg;

  public BMICalculator(double sizeInM, double weightInKg) throws InvalidSizeException {
    if (sizeInM <= 0) {
      throw new InvalidSizeException();
    }

    this.sizeInM = sizeInM;
    this.weightInKg = weightInKg;
  }

  public double getBmi() {
    return weightInKg / (sizeInM * sizeInM);
  }

  public String getBmiCategory() {
    return getBmi() < 18.5 ? "Untergewicht" : getBmi() < 25 ? "Normalgewicht" : "Uebergewicht";
  }

}
