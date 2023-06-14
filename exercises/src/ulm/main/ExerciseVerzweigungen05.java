package ulm.main;

import java.util.Scanner;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Verzweigungen-5
 */
public class ExerciseVerzweigungen05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte eine Jahreszahl ein: ");
    int year = scanner.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " ist ein Schaltjahr");
    } else {
      System.out.println(year + " ist kein Schaltjahr");
    }

  }

}
