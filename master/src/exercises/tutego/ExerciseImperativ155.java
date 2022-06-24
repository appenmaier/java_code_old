package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ155 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte eine natuerliche Zahl ein: ");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("1! = 1");
			return;
		}

		long total = 1;
		for (int i = 1; i <= n; i++) {
			total *= i;
		}

		String text = n + "! = 1";
		for (int i = 2; i <= n; i++) {
			text += " * " + i;
		}
		text += " = " + total;
		System.out.println(text);

	}

}
