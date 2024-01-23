package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * /pdf/exercises-koblenz.pdf
 * Aufgabe E1
 * 
 * Hinweis: ohne Fehlerbehandlung
 */
public class E180K_E01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    int[] numbers = new int[length];

    for (int i = 0; i < numbers.length; i++) {
      numbers[length - 1 - i] = i + 1;
    }

    IntegerArray.printArray(numbers, false);

  }

}
