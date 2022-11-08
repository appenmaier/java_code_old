package exercises.java;

import java.util.Scanner;

public class Cases01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int number = sc.nextInt();

    if (number % 2 == 0) {
      System.out.println("Ergebnis: Die eingegebene Zahl ist gerade");
    } else {
      System.out.println("Ergebnis: Die eingegebene Zahl ist ungerade");
    }

  }

}
