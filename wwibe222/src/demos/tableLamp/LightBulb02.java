package demos.tableLamp;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class LightBulb02 {

  /*
   * Attribute
   */
  private String color;

  /*
   * Methode
   */
  public void setColor(String c) {
    color = c;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

  public boolean equals(LightBulb02 lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
