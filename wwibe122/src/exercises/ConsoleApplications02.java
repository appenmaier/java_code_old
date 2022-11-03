package exercises;

import java.util.Scanner;

public class ConsoleApplications02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int a = sc.nextInt();
    System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
    int b = sc.nextInt();

    double result = 100 * ((double) a / b);

    System.out.println("Ergebnis: " + a + " von " + b + " sind " + result + "%");
    System.out.printf("Ergebnis: %d von %d sind %.2f%%", a, b, result);

  }

}
