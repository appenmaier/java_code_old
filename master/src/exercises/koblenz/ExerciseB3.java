package exercises.koblenz;

import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe B3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseB3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Gib bitte einen Wert fuer a ein: ");
		int a = scanner.nextInt();

		System.out.print("Gib bitte einen Wert fuer b ein: ");
		int b = scanner.nextInt();

		System.out.print("Gib bitte einen Wert fuer c ein: ");
		int c = scanner.nextInt();

		int low;
		int center;
		int high;

		if (a > b && a > c) {
			high = a;
			if (b > c) {
				center = b;
				low = c;
			} else {
				center = c;
				low = b;
			}
		} else if (b > a && b > c) {
			high = b;
			if (a > c) {
				center = a;
				low = c;
			} else {
				center = c;
				low = a;
			}
		} else {
			high = c;
			if (a > b) {
				center = a;
				low = b;
			} else {
				center = b;
				low = a;
			}
		}

		System.out.println("kleinste Zahl: " + low);
		System.out.println("mittlere Zahl: " + center);
		System.out.println("groesste Zahl: " + high);

	}

}