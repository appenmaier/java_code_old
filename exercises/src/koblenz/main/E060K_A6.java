package koblenz.main;


import java.util.Scanner;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe A6
 */
public class E060K_A6 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte einen Wert fuer a ein: ");
    int a = scanner.nextInt();

    System.out.print("Gib bitte einen Wert fuer b ein: ");
    int b = scanner.nextInt();

    int tmp = a;
    a = b;
    b = tmp;

    System.out.println("a: " + a);
    System.out.println("b: " + b);

  }

}
