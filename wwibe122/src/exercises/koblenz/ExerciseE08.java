package exercises.koblenz;

import java.util.Arrays;
import java.util.Scanner;
import helpers.IntegerArray;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe E8
 * 
 * Hinweis: ohne Fehlerbehandlung
 */
public class ExerciseE08 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    Arrays.sort(numbers);
    IntegerArray.printArrayWithIndices(numbers, false);

    System.out.print("Gib bitte den Suchwert ein: ");
    int value = sc.nextInt();

    int index = IntegerArray.getIndexWithBinarySearch(numbers, value, true);
    System.out.println("Index: " + index);

  }

}
