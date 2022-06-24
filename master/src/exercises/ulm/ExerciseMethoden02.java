package exercises.ulm;

import java.util.Scanner;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf
 * Aufgabe Methoden-2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseMethoden02 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte ein Wort ein: ");
		String word = sc.next();

		boolean isPalindrom = isPalindrom(word);
		System.out.println("isPalindrom: " + isPalindrom);

	}

	public static boolean isPalindrom(String word) {
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
