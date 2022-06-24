package demos;

import java.util.ArrayList;

/**
 * Die Klasse ArrayList<E>
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo24 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		// Elemente anfuegen
		names.add("Hans");
		names.add("Peter");
		names.add("Lisa");

		System.out.println(names);

		// Elemente hinzufuegen
		names.add(1, "Max");
		names.add(1, "Moritz");

		System.out.println(names);

		// Elemente loeschen
		names.remove(3);
		names.remove("Moritz");

		System.out.println(names);

		// Elemente auslesen mit der klassischen for-Schleife
		@SuppressWarnings("unused")
		String name0 = names.get(0);
		@SuppressWarnings("unused")
		String name2 = names.get(2);

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// Elemente auslesen mit der for-each-Schleife
		for (String name : names) {
			System.out.println(name);
		}

	}

}
