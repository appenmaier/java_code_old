package demos.tableLamp.v3;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class LightBulb {

  /*
   * Attribute
   */
  private String color;

  /*
   * Methode
   */
  public LightBulb(String color) {
    this.color = color;
  }

  public LightBulb() {
    this.color = "weiss";
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

  public boolean equals(LightBulb lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
