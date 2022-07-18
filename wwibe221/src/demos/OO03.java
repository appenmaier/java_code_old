package demos;

/**
 * Stringvergleiche mit == und equals(Object)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class OO03 {

	public static void main(String[] args) {

		String s1 = new String("Hallo Welt");
		String s2 = new String("Hallo Welt");

		// Der Vergleichsoperator uerberprueft, ob zwei Referenzvariablen das gleiche
		// Objekt referenzieren
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}

		// Die Methode equals(Object) ueberprueft, ob zwei Objekte "gleich" sind.
		// Objekte der Klasse String sing gleich, wenn ihre Zeichenketten gleich sind
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}

	}

}
