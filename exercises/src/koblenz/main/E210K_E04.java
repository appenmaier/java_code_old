package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe E4
 * 
 * Hinweis: ohne Fehlerbehandlung
 */
public class E210K_E04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    IntegerArray.printArray(numbers, false);

    IntegerArray.reverseArray(numbers);
    IntegerArray.printArray(numbers, false);

  }

}
