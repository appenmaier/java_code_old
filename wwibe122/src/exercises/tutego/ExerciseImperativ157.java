package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.7
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ157 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Zahl ein: ");
    long l = sc.nextLong();

    int smallestDigit = l == 0 ? 0 : 9;
    int bigestDigit = 0;

    long tmp = Math.abs(l);
    while (tmp > 0) {
      int digit = (int) (tmp % 10);
      if (digit > bigestDigit) {
        bigestDigit = digit;
      }
      if (digit < smallestDigit) {
        smallestDigit = digit;
      }
      tmp = tmp / 10;
    }

    System.out.println("Kleinste Ziffer: " + smallestDigit);
    System.out.println("Groesste Ziffer: " + bigestDigit);
  }

}
