package demos.tableLamp;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class LightBulb04 {

  /*
   * Attribute
   */
  private final Color color;

  /*
   * Methode
   */
  public LightBulb04(Color color) {
    this.color = color;
  }

  public LightBulb04() {
    this.color = Color.WHITE;
  }

  public Color color() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color.toString() + "]";
  }

  public boolean equals(LightBulb04 lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
