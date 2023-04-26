package exercises.ulm;

import java.util.Scanner;
import helpers.Printer;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Schleifen-3
 */
public class ExerciseSchleifen03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Breite des Rechteckes ein: ");
    int width = sc.nextInt();

    System.out.print("Gib bitte die Hoehe des Rechteckes ein: ");
    int height = sc.nextInt();

    Printer.printRectangle(width, height);

  }

}
