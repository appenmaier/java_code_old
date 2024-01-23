package koblenz.main;


import java.util.Scanner;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe A4
 */
public class E040K_A4 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte Deinen Vornamen ein: ");
    String firstName = scanner.next();

    System.out.print("Gib bitte Deinen Nachnamen ein: ");
    String familyName = scanner.next();

    System.out.println(familyName + ", " + firstName);

  }

}
