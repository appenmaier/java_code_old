package exercises.java;

import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-14
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte den Namen eingeben: ");
		String name = sc.next();

		System.out.print("Gib bitte das Geschlecht eingeben (m, w, d): ");
		char gender = sc.next().charAt(0);

		String title;
		switch (gender) {
		case 'm':
			title = "Herr";
			break;
		case 'w':
			title = "Frau";
			break;
		default:
			title = "";
			break;
		}

		// String title = switch (gender) {
		// case 'm' -> "Herr";
		// case 'w' -> "Frau";
		// default -> "";
		// };

		System.out.println("Hallo " + title + " " + name);

	}

}
