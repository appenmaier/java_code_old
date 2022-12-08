package demos.tableLamp.v5;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class LightBulb {

  /*
   * Attribute
   */
  private final Color color;

  /*
   * Methode
   */
  public LightBulb(Color color) {
    this.color = color;
  }

  public LightBulb() {
    this.color = Color.WHITE;
  }

  public Color color() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color.toString() + "]";
  }

  public boolean equals(LightBulb lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

}
