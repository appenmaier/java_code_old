package koblenz.main;

import java.util.Scanner;
import koblenz.model.Calculator;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe C1
 */
public class E130K_C01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Bitte gib einen Wert fuer m ein: ");
    int m = sc.nextInt();

    System.out.print("Bitte gib einen Wert fuer n ein: ");
    int n = sc.nextInt();

    int total = Calculator.calculateSumWithWile(m, n);

    System.out.println("total: " + total);

  }

}