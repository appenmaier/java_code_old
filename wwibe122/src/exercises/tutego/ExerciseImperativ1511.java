package exercises.tutego;

import java.util.Scanner;
import helpers.Printer;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.11
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ1511 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Wiederholungen ein: ");
    int repetitions = sc.nextInt();

    Printer.printFishPattern(repetitions);

  }

}
