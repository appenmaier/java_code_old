package demos.tableLamp;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class LightBulb {

  private final Color color;

  public LightBulb() {
    this.color = Color.WHITE;
  }

  public LightBulb(Color color) {
    this.color = color;
  }

  public Color color() {
    return color;
  }

  public boolean equals(LightBulb lightBulb) {
    boolean isEqual = this.color.equals(lightBulb.color);
    return isEqual;
  }

  @Override
  public String toString() {
    return "LightBulb [color=" + color.toString() + "]";
  }

}
