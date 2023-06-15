package ulm.main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Felder-5
 */
public class E220U_Felder05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Groesse des Feldes ein: ");
    int length = sc.nextInt();

    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.print("Gib bitte eine Zahl ein: ");
      int number = sc.nextInt();
      numbers[i] = number;
    }

    System.out.println(Arrays.toString(numbers));

    int tmp;
    for (int i = 1; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
          tmp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = tmp;
        }
      }
    }

    System.out.println(Arrays.toString(numbers));

  }

}
