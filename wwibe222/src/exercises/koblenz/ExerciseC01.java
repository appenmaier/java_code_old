package exercises.koblenz;

import java.util.Scanner;
import helpers.Calculator;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe C1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseC01 {

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
