package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.4.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ141 {

  final static int PRICE = 1000;
  final static double HIGH_DEVIATION_LIMIT = PRICE + PRICE * 0.2;
  final static double LOW_DEVIATION_LIMIT = PRICE - PRICE * 0.1;

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den Betrag ein, den Du Bonny geben moechtest: ");
    int amount = sc.nextInt();

    if (amount > HIGH_DEVIATION_LIMIT || amount < LOW_DEVIATION_LIMIT) {
      System.out.println("You son of a bi***!");
    } else {
      System.out.println("Good boy!");
    }

  }

}
