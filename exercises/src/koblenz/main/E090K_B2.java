package koblenz.main;

import java.util.Scanner;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe B2
 */
public class E090K_B2 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte eine Jahreszahl ein: ");
    int year = scanner.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " ist ein Schaltjahr");
    } else {
      System.out.println(year + " ist kein Schaltjahr");
    }

  }

}
