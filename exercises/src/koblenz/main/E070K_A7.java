package koblenz.main;


import java.util.Scanner;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe A7
 */
public class E070K_A7 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte einen Wert fuer a ein: ");
    int a = scanner.nextInt();

    System.out.print("Gib bitte einen Wert fuer b ein: ");
    int b = scanner.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a: " + a);
    System.out.println("b: " + b);

  }

}
