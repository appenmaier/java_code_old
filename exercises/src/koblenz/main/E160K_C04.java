package koblenz.main;

import java.util.Scanner;
import koblenz.model.Printer;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe C4
 */
public class E160K_C04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Hoehe des Weihnachtsbaumes ein: ");
    int height = sc.nextInt();

    Printer.printChristmasTree(height);

  }

}