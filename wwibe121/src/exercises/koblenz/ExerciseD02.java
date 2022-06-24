package exercises.koblenz;

import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe D2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseD02 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte die Anzahl Regentropfen ein: ");
		int drops = sc.nextInt();

		double x;
		double y;
		double d;

		int counter = 0;

		for (int i = 0; i < drops; i++) {
			x = Math.random();
			y = Math.random();

			d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			if (d <= 1) {
				counter++;
			}
		}

		double pi = ((double) counter / drops) * 4;

		double deviation = Math.abs(Math.PI - pi);

		System.out.println("pi: " + pi);
		System.out.println("Math.PI: " + Math.PI);
		System.out.println("deviation: " + deviation);

	}

}
