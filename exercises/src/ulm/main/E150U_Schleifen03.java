package ulm.main;

import java.util.Scanner;
import ulm.model.Printer;

/**
 * /pdf/exercises-ulm.pdf Aufgabe Schleifen-3
 */
public class E150U_Schleifen03 {

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
