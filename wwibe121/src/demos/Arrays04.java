package demos;

/**
 * Einschraenkungen von Feldern
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Arrays04 {

	public static void main(String[] args) {

		String[] names = new String[5];

		names[0] = "Hans";
		names[1] = "Peter";
		names[2] = "Lisa";

		/*
		 * Problem 1
		 */
		System.out.println("Problem 1");
		System.out.println("---------");
		// Problem: null-Werte sorgen bei der Ausgabe bzw. dem Zaehlen der Elemente fuer
		// Probleme
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();

		// Loesung: null-Werte muessen uebersprungen/ignoriert werden
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				continue;
			}
			System.out.println(names[i]);
			count++;
		}
		System.out.println();
		System.out.println("maximale Anzahl Elemente: " + names.length);
		System.out.println("Anzahl Elemente: " + count);
		System.out.println();

		/*
		 * Problem 2
		 */
		System.out.println("Problem 2");
		System.out.println("---------");
		// Problem: Felder koennen nicht erweitert werden
		names[3] = "Heidi";
		names[4] = "Max";
		// names[5] = "Maria";

		// Loesung: alle Elemente des Feldes muessen in ein neues Feld kopiert werden
		String[] tmp = new String[names.length + names.length / 2];
		for (int i = 0; i < names.length; i++) {
			tmp[i] = names[i];
		}
		names = tmp;
		names[5] = "Maria";

		// Ausgabe
		count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				continue;
			}
			System.out.println(names[i]);
			count++;
		}
		System.out.println();
		System.out.println("maximale Anzahl Elemente: " + names.length);
		System.out.println("Anzahl Elemente: " + count);
		System.out.println();

		/*
		 * Problem 3
		 */
		System.out.println("Problem 3");
		System.out.println("---------");
		// Problem: ein Element soll an einer bestimmten Stelle eingefuegt werden
		// names[3] = "Fritz";

		// Loesung: alle betroffenen Elemente muessen eine Stelle nach rechts verschoben
		// werden
		int index = 3;
		for (int i = names.length - 2; i >= index; i--) {
			if (names[i] == null) {
				continue;
			}
			names[i + 1] = names[i];
		}
		names[index] = "Fritz";

		// Ausgabe
		count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				continue;
			}
			System.out.println(names[i]);
			count++;
		}
		System.out.println();
		System.out.println("maximale Anzahl Elemente: " + names.length);
		System.out.println("Anzahl Elemente: " + count);
		System.out.println();

	}

}
