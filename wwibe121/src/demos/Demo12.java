package demos;

import java.util.Locale;

/**
 * Konsolenausgaben mit Hilfe der print-Methoden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo12 {

	public static void main(String[] args) {

		/*
		 * print- und println-Methoden
		 */
		System.out.print("Text 1");
		System.out.println("Text 2");
		System.out.print("Text 3");
		System.out.println();

		/*
		 * printf-Method
		 */

		// Aufbau einer Formatierungsregel
		// %[flags][width][.precision]conversion-character

		// String-Formatierungen (s)
		String a = "Hallo";
		String b = "Welt";
		System.out.printf("%s %s%n", a, b);
		System.out.printf("%S %S%n", a, b); // Grossuchstabenkonvertierung
		System.out.printf("%20s %s%n", a, b); // Festlegen der Ausgabenlaenge
		System.out.printf("%-20s %s%n", a, b); // linksbuendige Ausgabe
		System.out.printf("%.3s%n", a); // Festlegen der Genauigkeit

		// Character- und Boolean-Formatierungen (c bzw. b)
		System.out.printf("%C%n", 'x'); // Grossbuchstabenkonvertierung
		System.out.printf("%B%n", true); // Grossbuchstabenkonvertierung

		// Integer-Formatierungen (d)
		System.out.println(1000000000);
		System.out.printf("%,d%n", 1000000000); // Festlegen des Tausendertrennzeichens
		System.out.printf(Locale.US, "%,d%n", 1000000000); // Festlegen des Tausendertrennzeichens

		// FLTP-Formatierungen (f)
		System.out.printf("%.2f%n", 5.7691432); // Festlegen der Genauigkeit

	}

}