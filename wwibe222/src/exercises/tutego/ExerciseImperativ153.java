package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ153 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    int total = 0;
    while (true) {
      System.out.print("Gib bitte eine Zahl ein: ");
      int number = sc.nextInt();

      if (number == 0) {
        break;
      }

      total += number;
    }

    System.out.println("total: " + total);
  }

}
