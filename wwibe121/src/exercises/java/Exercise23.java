package exercises.java;

/**
 * Uebungsaufgabe JAVA-23
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise23 {

	public static void main(String[] args) {

		int[] numbers = { 4, 8, 2, 6, 9, 1 };

		System.out.print("Eingabe: ");
		print(numbers);

		// numbers = copyReversed(numbers);
		reverse(numbers);

		System.out.print("Ausgabe: ");
		print(numbers);

	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] copyReversed(int[] array) {
		int[] reverseArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			reverseArray[array.length - 1 - i] = array[i];
		}

		return reverseArray;
	}

	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = tmp;
		}
	}

}
