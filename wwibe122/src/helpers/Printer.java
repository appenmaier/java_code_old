package helpers;

/**
 * Konsolendrucker
 *
 * @author Daniel Appenmaier
 */
public class Printer {

  /**
   * Gibt die Zeichenkette "Hello World" auf der Konsole aus
   */
  public static void printHelloWorld() {
    System.out.print("Hello World");
  }

  /**
   * Gibt eine eingehende Zeichenkette auf der Konsole aus
   *
   * @param text eingehender Text
   */
  public static void printText(String text) {
    System.out.print(text);
  }

}
