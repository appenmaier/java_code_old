package exercises.koblenz;

import java.util.Scanner;

import helpers.Printer;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe C4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseC04 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte die Hoehe des Weihnachtsbaumes ein: ");
		int height = sc.nextInt();

		Printer.printChristmasTree(height);

	}

}
