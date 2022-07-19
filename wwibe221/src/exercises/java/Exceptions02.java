package exercises.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercises.java.barrel.v1.Barrel;
import exercises.java.barrel.v1.BarrelOverflowException;

/**
 * Uebungsaufgabe Exceptions02
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Exceptions02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		Barrel barrel;

		while (true) {
			try {
				System.out.print("Bitte Kapazitaet des Fasses eingeben: ");
				int capacity = scanner.nextInt();
				barrel = new Barrel(capacity);
				break;
			} catch (InputMismatchException e) {
				System.err.println("Ungueltige Eingabe, bitte nochmal");
				scanner.next();
			}
		}

		while (loop) {
			int amount;
			while (true) {
				try {
					System.out.print("Bitte die Menge der hinzuzufuegenden Fluessigkeit angeben: ");
					amount = scanner.nextInt();
					try {
						barrel.addFluid(amount);
					} catch (BarrelOverflowException e) {
						System.err.println(e.getMessage());
					}
					break;
				} catch (InputMismatchException e) {
					System.err.println("Ungueltige Eingabe, bitte nochmal");
					scanner.next();
				}
			}

			barrel.printFluidLevel();

			while (true) {
				try {
					System.out.print("Nochmal?: ");
					loop = scanner.nextBoolean();
					break;
				} catch (InputMismatchException e) {
					System.err.println("Ungueltige Eingabe, bitte nochmal");
					scanner.next();
				}
			}
		}

	}

}
