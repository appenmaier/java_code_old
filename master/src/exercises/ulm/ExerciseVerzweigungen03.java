package exercises.ulm;

import java.util.Scanner;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf
 * Aufgabe Verzweigungen-3
 *
 * @author: Daniel Appenmaier
 * @version: 1.0
 */
public class ExerciseVerzweigungen03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte gib Dein Gewicht in KG ein: ");
		int weight = sc.nextInt();

		System.out.print("Bitte gib Deine Groesse in M ein: ");
		double size = sc.nextDouble();

		double bmi = weight / (size * size);

		if (bmi < 20) {
			System.out.printf("Dein BMI betraegt %.0f (Untergewicht)%n", bmi);
		} else if (bmi < 25) {
			System.out.printf("Dein BMI betraegt %.0f (Normalgewicht)%n", bmi);
		} else if (bmi < 30) {
			System.out.printf("Dein BMI betraegt %.0f (Uebergewicht)%n", bmi);
		} else if (bmi < 40) {
			System.out.printf("Dein BMI betraegt %.0f (starkes Uebergewicht)%n", bmi);
		} else {
			System.out.printf("Dein BMI betraegt %.0f (extremes Uebergewicht)%n", bmi);
		}

	}

}
