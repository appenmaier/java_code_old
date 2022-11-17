package demos;

/**
 * Imperatives Programmieren vs. Objektorientiertes Programmieren
 * 
 * @author Daniel Appenmaier
 *
 */

public class OO01 {

  public static void main(String[] args) {

    /* Zeichenketten (imperativ) */
    int length;

    String name = "Hans-Peter";

    length = OO01.length(name);
    System.out.println("length: " + length);

    length = OO01.length("Hello World");
    System.out.println("length: " + length);

    /* Zeichenketten (objektorientiert) */
    length = name.length();

    /* Tischleuchten (imperativ) */
    boolean isConnected = true;
    boolean isOn = false;
    boolean hasLightBulb = false;
    String colorOfLightBulb = "rot";
    boolean isShining = true;

    if (isConnected && isOn && hasLightBulb) {
      isShining = true;
    }

    // isShining = isConnected && isOn && hasLightBulb ? true : false;

    if (isShining) {
      System.out.println("Die Lampe leuchtet " + colorOfLightBulb);
    } else {
      System.out.println("Die Lampe leuchtet nicht");
    }

  }

  public static int length(String text) {
    int length = 0;
    for (int i = 0; i < text.length(); i++) {
      length++;
    }
    return length;
  }

}
