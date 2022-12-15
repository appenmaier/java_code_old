package demos.tableLamp;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class LightBulb_v3 {

  /*
   * Attribute
   */
  private String color;

  /*
   * Methode
   */
  public LightBulb_v3(String color) {
    this.color = color;
  }

  public LightBulb_v3() {
    this.color = "weiss";
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

  public boolean equals(LightBulb_v3 lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
