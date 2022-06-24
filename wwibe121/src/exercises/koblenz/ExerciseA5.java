package exercises.koblenz;

import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe A5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseA5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Gib bitte eine ganze Zahl ein: ");
		int a = scanner.nextInt();

		System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
		int b = scanner.nextInt();

		int c = a + b;

		System.out.println("Die Summe von " + a + " und " + b + " ist " + c + ".");

	}

}