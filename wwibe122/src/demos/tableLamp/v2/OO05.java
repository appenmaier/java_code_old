package demos.tableLamp.v2;

/**
 * Vergleichen von Objekten
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO05 {

  public static void main(String[] args) {

    LightBulb redLightBulb1 = new LightBulb();
    redLightBulb1.setColor("rot");

    LightBulb redLightBulb2 = new LightBulb();
    redLightBulb2.setColor("rot");

    /*
     * Der Vergleichsoperator == ueberprueft, ob zwei Referenzvariablen dasselbe Objekt
     * referenzieren
     */
    if (redLightBulb1 == redLightBulb2) {
      System.out.println("redLightBulb1 == redLightBulb2");
    }

    String color1 = redLightBulb1.getColor();
    String color2 = redLightBulb2.getColor();

    /*
     * Die Methode equals(Object) ueberprueft, ob zwei Objekte "gleich" sind. Objekte sind gleich,
     * wenn all ihre Attribute gleich sind
     */
    if (color1.equals(color2)) {
      System.out.println("color1.equals(color2)");
    }

    if (redLightBulb1.equals(redLightBulb2)) {
      System.out.println("redLightBulb1.equals(redLightBulb2)");
    }

  }

}
