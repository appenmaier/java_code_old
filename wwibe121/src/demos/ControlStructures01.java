package demos;

import java.util.Scanner;

/**
 * Einfach- und Mehrfachverwzeigungen mit if-else
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ControlStructures01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int age;

		System.out.print("Gib bitte Dein Alter ein: ");
		age = sc.nextInt();

		/*
		 * Einfachverzweigungen
		 */
		if (age >= 18) {
			System.out.println("Du bist volljaehrig");
		} else {
			System.out.println("Du bist minderjaehrig");
		}

		/*
		 * Vergleichsoperatoren: == (gleich), != (ungleich), > (groesser), >=
		 * (groessergleich), < (kleiner), <= (kleinergleich) Logische Operatoren: &&
		 * (UND), || (ODER), ! (VERNEINUNG)
		 */

		/*
		 * Mehrfachverzweigungen
		 */
		if (age < 12) {
			System.out.println("Du bist ein Kind");
		} else if (age < 18) {
			System.out.println("Du bist ein/e Jugendliche/r");
		} else if (age < 60) {
			System.out.println("Du bist ein/e Erwachsene/r");
		} else {
			System.out.println("Du bist ein/e Senior/in");
		}

		/*
		 * Vergleichen von Zeichenketten
		 */
		System.out.print("Gib bitte \"true\": ");
		String text = sc.next();

		System.out.println("text: " + text);

		if (text.equals("true")) {
			System.out.println("Super, Du hast \"true\" eingegeben");
		} else {
			System.out.println("Schade, Du hast leider nicht \"true\" eingegeben");
		}

	}

}
