package demos;

/**
 * Schleifen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo16 {

	public static void main(String[] args) {

		/*
		 * while-Schleife (kopfgesteuerte Schleife)
		 */
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println();

		/*
		 * do/while-Schleife (fussgesteuerte Schleife)
		 */
		int j = 1;

		do {
			System.out.println(j);
			j++;
		} while (j <= 10);

		System.out.println();

		/*
		 * for-Schleife (Zaehlschleife)
		 */
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		for (int k = 10; k > 0; k--) {
			System.out.println(k);
		}

		String text = "Hallo Welt";
		@SuppressWarnings("unused")
		int length = text.length();

		for (int k = 0; k < text.length(); k++) {
			System.out.println(k + ": " + text.charAt(k));
		}

		/*
		 * Sichtbarkeit von Schleifenvariablen
		 */
		System.out.println(i);
		System.out.println(j);
		// System.out.println(k);

	}

}
