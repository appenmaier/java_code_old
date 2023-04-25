package demos;

import java.util.Scanner;

/**
 * Konsoleingaben mit Hilfe der Klasse Scanner
 * 
 * @author Daniel Appenmaier
 * 
 */
public class ConsoleApplications01 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* Scanner initialisieren */
    Scanner sc = new Scanner(System.in);

    /* Werte auslesen und zurückgeben */
    System.out.print("Bitte gib eine ganze Zahl ein: ");
    int int1 = sc.nextInt();
    System.out.println("int1: " + int1);

    System.out.print("Bitte gib eine reelle Zahl ein: ");
    double double1 = sc.nextDouble();
    System.out.println("double1: " + double1);

    System.out.print("Bitte gib einen boolschen Wahrheitswert ein: ");
    boolean boolean1 = sc.nextBoolean();
    System.out.println("boolean1: " + boolean1);

    System.out.print("Bitte gib ein einzelnes Zeichen ein: ");
    char char1 = sc.next().charAt(0);
    System.out.println("char1: " + char1);

    System.out.print("Bitte gib eine beliebige Zeichenkette ein: ");
    sc.nextLine();
    String string1 = sc.nextLine();
    System.out.println("string1: " + string1);

  }

}
