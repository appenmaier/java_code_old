package exercises.java;

import java.util.Scanner;

import exercises.java.barrel.v1.Barrel;
import exercises.java.barrel.v1.BarrelOverflowException;

/**
 * Uebungsaufgabe Exceptions02
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exceptions02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Gib bitte die Kapazitaet des Fasses ein: ");
		int capacity = scanner.nextInt();

		Barrel barrel = new Barrel(capacity);

		boolean loop = true;
		while (loop) {
			try {
				System.out.print("Gib bitte die Menge der hinzuzufuegenden Fluessigkeit ein: ");
				int value = scanner.nextInt();
				if (value <= 0) {
					loop = false;
				} else {
					barrel.addFluidLevel(value);
					barrel.printFluidLevel();
				}
			} catch (BarrelOverflowException e) {
				System.err.println(e.getMessage());
				loop = false;
			}
		}

	}

}
