package exercises;

import java.util.Scanner;

public class ConsoleApplications01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int a = sc.nextInt();
    System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
    int b = sc.nextInt();

    int result = a + b;

    System.out.println("Ergebnis: " + a + " + " + b + " = " + result);
    System.out.printf("Ergebnis: %d + %d = %d", a, b, result);

  }

}
