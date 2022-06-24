package exercises.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-19
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise19 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(100) + 1;

		int attempts = 0;

		boolean loop;
		do {
			attempts++;

			System.out.print("Gib bitte Deinen Tipp ein: ");
			int tip = sc.nextInt();

			if (tip == randomNumber) {
				System.out.println("Richtig. Du hast " + attempts + " Versuche benoetigt");
				break;
				// return
			} else if (tip > randomNumber) {
				System.out.println("Leider falsch, die gesuchte Zahl ist kleiner");
			} else {
				System.out.println("Leider falsch, die gesuchte Zahl ist groesser");
			}

			System.out.print("Moechtest Du nochmals raten (true, false)?: ");
			loop = sc.nextBoolean();
		} while (loop);

		System.out.println("Die gesuchte Zahl war " + randomNumber);

	}

}
