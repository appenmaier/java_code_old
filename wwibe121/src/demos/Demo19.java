package demos;

import java.util.Random;

/**
 * Felder
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo19 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// Deklaration und Initialisierung von Feldern
		int[] is = new int[100];
		String[] names = { "Hans", "Peter", "Lisa" };

		// Zugriff auf einzelne Feld-Elemente
		is[0] = 5;
		is[50] = 3;
		is[99] = 7;
		// is[100] = 6

		names[2] = "Heidi";
		// names[3] = "Franz";

		// Sequentieller Zugriff auf alle Feld-Elemente
		for (int i = 0; i < is.length; i++) {
			is[i] = rnd.nextInt(10);
		}

		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
