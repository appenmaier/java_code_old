package exercises.koblenz;

import java.util.Scanner;
import helpers.IntegerArray;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe E5
 * 
 * Hinweis: ohne Fehlerbehandlung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseE05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    System.out.print("numbers: ");
    IntegerArray.printArray(numbers, false);

    int[] copyOfNumbers = IntegerArray.copyArray(numbers);
    System.out.print("copyOfNumbers: ");
    IntegerArray.printArray(copyOfNumbers, false);

    IntegerArray.reverseArray(numbers);
    System.out.print("numbers: ");
    IntegerArray.printArray(numbers, false);
    System.out.print("copyOfNumbers: ");
    IntegerArray.printArray(copyOfNumbers, false);

  }

}
