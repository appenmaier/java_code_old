package demos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fehlerarten
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo39 {

	public static void main(String[] args) {

		/*
		 * Kompilerfehler bzw. Syntaxfehler
		 */
		// string x;
		// Hallo Welt;

		/*
		 * Logische Fehler
		 */
		System.out.println("4 + 5 = " + add(4, 5));

		/*
		 * Laufzeitfehler bzw. Ausnahmen
		 */
		// InputMismatchException
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Bitte eine ganze Zahl eingeben: ");
			int number = sc.nextInt();
			System.out.println("number: " + number);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		// ArrayIndexOutOfBoundsException
		try {
			int[] numbers = { 3, 1, 6, 5 };
			int i = numbers[4];
			System.out.println("i: " + i);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		// NullPointerException
		try {
			String text = null;
			@SuppressWarnings("null")
			char character = text.charAt(0);
			System.out.println("character: " + character);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// ClassCastException
		try {
			Object object;
			Integer integer = 5;
			@SuppressWarnings("unused")
			String string;

			object = integer; // Upcast
			string = (String) object; // Downcast
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

	}

	public static int add(int a, int b) {
		return a - b;
	}

}
