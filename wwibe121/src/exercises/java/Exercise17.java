package exercises.java;

import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-17
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte eine Zeichenkette ein: ");
		String text = sc.nextLine();

		System.out.print("Gib bitte das zu analysierende Zeichen ein: ");
		char token = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == token) {
				count++;
			}
		}

		double percentage = count * 100 / text.length();

		System.out.printf("Absoluter Anteil: %d%n", count);
		System.out.printf("Prozentualer Anteil: %.2f%%%n", percentage);

	}

}
