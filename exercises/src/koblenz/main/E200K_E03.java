package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe E3
 * 
 * Hinweis: ohne Fehlerbehandlung
 */
public class E200K_E03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    IntegerArray.printArrayWithIndices(numbers, false);

    System.out.print("Gib bitte den ersten Index ein: ");
    int index1 = sc.nextInt();

    System.out.print("Gib bitte den zweiten Index ein: ");
    int index2 = sc.nextInt();

    IntegerArray.swapValues(numbers, index1, index2);
    IntegerArray.printArrayWithIndices(numbers, false);

  }

}
