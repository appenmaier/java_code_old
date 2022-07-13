package demos;

import java.util.Scanner;

import demos.tablelamp.v9.FlashLight;
import demos.tablelamp.v9.Light;
import demos.tablelamp.v9.PlugType;
import demos.tablelamp.v9.TableLamp;

/**
 * Programmfehler
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo39 {

	@SuppressWarnings({ "resource", "unused", "null" })
	public static void main(String[] args) {

		/*
		 * Kompilierungsfehler
		 */
//		string x;
//		Hallo Welt

		/*
		 * Logikfehler
		 */
		System.out.println("4 / 3 = " + divide(4, 3));

		/*
		 * Laufzeitfehler
		 */
		// InputMismatchException
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gibt bitte eine Zahl ein: ");
		int i = scanner.nextInt();

		// ArrayIndexOutOfBoundsException
		int[] numbers = { 5, 3, 2, 9 };
		int number = numbers[4];

		// NullPointerException
		String text = null;
		char firstCharacter = text.charAt(0);

		// ClassCastException
		TableLamp tableLamp = new TableLamp(PlugType.TYPE_B);
		Light light = tableLamp; // Upcast
		FlashLight flashLight = (FlashLight) light; // Downcast

	}

	public static int divide(int a, int b) {
		return a * b;
	}

}
