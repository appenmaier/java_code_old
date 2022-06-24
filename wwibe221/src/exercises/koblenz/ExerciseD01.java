package exercises.koblenz;

import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe D1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseD01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte einen Wert fuer p ein: ");
		int p = sc.nextInt();

		System.out.print("Gib bitte einen Wert fuer q ein: ");
		int q = sc.nextInt();

		int r;
		do {
			r = p % q;
			if (r == 0) {
				break;
			}
			p = q;
			q = r;
		} while (true);

		System.out.println("Groesster gemeinsamer Teiler: " + q);

	}

}
