package exercises.ulm;

import java.util.Scanner;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Felder-2
 */
public class ExerciseFelder02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Groesse des Feldes ein: ");
    int length = sc.nextInt();

    double[] amounts = new double[length];

    for (int i = 0; i < length; i++) {
      System.out.print("Gib bitte einen Betrag ein: ");
      double amount = sc.nextDouble();
      amounts[i] = amount;
    }

    double total = 0;
    for (int i = 0; i < length; i++) {
      total += amounts[i];
    }

    System.out.println("Gesamtbetrag: " + total);

  }

}
