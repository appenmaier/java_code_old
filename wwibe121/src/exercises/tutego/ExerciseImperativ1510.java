package exercises.tutego;

import java.util.Scanner;

import helpers.Printer;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.10
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ1510 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte die Breite des Baumes ein: ");
		int width = sc.nextInt();

		System.out.print("Gib bitte die Hauefigkeit des Schmucks ein: ");
		double frequency = sc.nextDouble();

		Printer.printChristmasTreeWithOrnaments(width, frequency);

	}

}
