package demos.tableLamp;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class LightBulb03 {

  /*
   * Attribute
   */
  private String color;

  /*
   * Methode
   */
  public LightBulb03(String color) {
    this.color = color;
  }

  public LightBulb03() {
    this.color = "weiss";
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

  public boolean equals(LightBulb03 lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
