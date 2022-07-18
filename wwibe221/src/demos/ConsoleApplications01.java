package demos;

import java.util.Scanner;

/**
 * Konsoleneingaben mit Hilfe der Klasse Scanner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ConsoleApplications01 {

	public static void main(String[] args) {

		// Scanner initialisieren
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Werte auslesen
		System.out.print("Gib bitte eine Zeichenkette ein: ");
		String string1 = scanner.nextLine();
		System.out.println("string1: " + string1);

		System.out.print("Gib bitte eine ganze Zahl ein: ");
		int int1 = scanner.nextInt();
		System.out.println("int1: " + int1);

		System.out.print("Gib bitte eine reelle Zahl ein: ");
		double double1 = scanner.nextDouble();
		System.out.println("double1: " + double1);

		System.out.print("Gib bitte einen Wahrheitswert ein: ");
		boolean boolean1 = scanner.nextBoolean();
		System.out.println("boolean1: " + boolean1);

		System.out.print("Gib bitte ein einzelnes Zeichen ein: ");
		char char1 = scanner.next().charAt(0);
		System.out.println("char1: " + char1);

		System.out.print("Gib bitte eine Zeichenkette ein: ");
		scanner.nextLine();
		String string2 = scanner.nextLine();
		System.out.println("string2: " + string2);

	}

}