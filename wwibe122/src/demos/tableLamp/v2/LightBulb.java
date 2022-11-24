package demos.tableLamp.v2;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 2.0
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
  public void setColor(String c) {
    color = c;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

}
