package exercises.java;

import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-08
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise08 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte eine ganze Zahl ein: ");
		int a = sc.nextInt();

		System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
		int b = sc.nextInt();

		double c = (a * 100.0) / b;

		System.out.println("Ergebnis: " + a + " von " + b + " sind " + c + "%");
		// System.out.printf("Ergebnis: %d von %d sind %.2f%%", a, b, c);
	}

}
