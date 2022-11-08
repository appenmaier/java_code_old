package exercises.tutego;

import java.util.Scanner;
import helpers.Printer;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.8
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ158 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Hoehe der Fahne ein: ");
    int height = sc.nextInt();

    Printer.printBanner(height);

  }

}
