package exercises.koblenz;

import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe B2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseB2 {

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