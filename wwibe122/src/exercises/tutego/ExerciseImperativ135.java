package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.3.5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ135 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Flaschen ein: ");
    int numberOfBottles = sc.nextInt();

    String text = numberOfBottles == 1 ? "Eine Flasche Rum" : numberOfBottles + " Flaschen Rum";
    System.out.println(text);
  }

}
