package exercises.java;

import java.util.Scanner;

public class Loops02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int number = scanner.nextInt();

    boolean isPrime = true;

    if (number < 2) {
      isPrime = false;
    } else if (number > 2) {
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    System.out.println(isPrime ? "Ergebnis: Die eingegebene Zahl ist eine Primzahl"
        : "Ergebnis: Die eingegebene Zahl ist keine Primzahl");

  }

}
