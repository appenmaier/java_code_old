package exercises.java;

/**
 * Uebungsaufgabe JAVA-22
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise22 {

	public static void main(String[] args) {

		int[] powerOfTwo = new int[16];

		for (int i = 0; i < powerOfTwo.length; i++) {
			powerOfTwo[i] = (int) Math.pow(2, i);
		}

		System.out.println("Zweierpotenzen:");
		for (int i = 0; i < powerOfTwo.length; i++) {
			System.out.println(powerOfTwo[i]);
		}

	}

}
