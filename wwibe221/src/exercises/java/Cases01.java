package exercises.java;

import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-09
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Cases01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte eine ganze Zahl ein: ");
		int a = sc.nextInt();

		int b = a % 2;

		if (b == 0) {
			System.out.println("Ergebnis: Die eingegebene Zahl ist gerade");
		} else {
			System.out.println("Ergebnis: Die eingegebene Zahl ist ungerade");
		}

	}

}
