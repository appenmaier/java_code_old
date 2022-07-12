package demos;

import demos.tablelamp.v9.FlashLight;
import demos.tablelamp.v9.Light;
import demos.tablelamp.v9.PlugType;
import demos.tablelamp.v9.TableLamp;

/**
 * Softwarefehler
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo39 {

	public static void main(String[] args) {

		/* Syntax-Fehler */
//		string x;
//		Hallo Welt

		/* Logische Fehler */
		System.out.println("4 / 3 = " + divide(4, 3));

		/* Laufzeitfehler */
		// InputMismatchException
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Gibt bitte eine Zahl ein: ");
//		int x = scanner.nextInt();

		// ArrayIndexOutOfBoundsException
//		int[] numbers = { 5, 3, 2, 9 };
//		int number = numbers[4];

		// NullPointerException
//		String text = null;
//		char firstCharacter = text.charAt(0);

		// ClassCastException
//		Light light;
//		TableLamp tableLamp = new TableLamp(PlugType.TYPE_B);
//		FlashLight flashLight;
//
//		light = tableLamp; // Upcast
//		flashLight = (FlashLight) light; // Downcast

	}

	public static int divide(int a, int b) {
		return a * b;
	}

}
