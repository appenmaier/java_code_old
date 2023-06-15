package ulm.main;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Variablen-6
 *
 * Hinweise: ohne Einlesen, Kreisflaeche A = PI * r * r
 */
public class E060U_Variablen06 {

  public static void calculateCircularArea(double r) {
    double circularArea = Math.PI * Math.pow(r, 2);
    // double circularArea = 3.14159 * r * r;
    System.out.println("Kreisflaeche: " + circularArea);
  }

  public static void calculateCircumference(double r) {
    double circumference = 2 * Math.PI * r;
    // double circumference = 2 * 3.14159 * r;
    System.out.println("Kreisumfang: " + circumference);
  }

  public static void main(String[] args) {
    E060U_Variablen06.calculateCircumference(1.5);
    E060U_Variablen06.calculateCircularArea(1.5);
  }

}
