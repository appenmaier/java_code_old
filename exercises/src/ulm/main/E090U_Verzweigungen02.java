package ulm.main;

import java.util.Scanner;

/**
 * /pdf/exercises-ulm.pdf Aufgabe Verzweigungen-2
 */
public class E090U_Verzweigungen02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Bitte gib eine ganze Zahl ein: ");
    int a = sc.nextInt();

    System.out.print("Bitte gib eine weitere ganze Zahl ein: ");
    int b = sc.nextInt();

    if (a > b) {
      System.out.println("Die groessere Zahl ist " + a);
    } else if (a < b) {
      System.out.println("Die groessere Zahl ist " + b);
    } else {
      System.out.println("Die Zahlen sind gleichgross");
    }

  }

}
