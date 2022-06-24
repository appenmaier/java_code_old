package exercises.ulm;

import java.util.Scanner;

import helpers.Printer;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf
 * Aufgabe Methoden-3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseMethoden03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte die Hoehe der Weihnachtsbaumkrone ein: ");
		int height = sc.nextInt();

		Printer.printChristmasTreeCrown(height);

		int stemHeight = height / 3;
		int stemWidth;
		if (height % 2 == 0) {
			stemWidth = (height * 2 - 1) / 3;
		} else {
			stemWidth = (height * 2 - 1) / 3 + 1;
		}
		int stemGap = (height * 2 - 1) / 3;
		Printer.printChristmasTreeStem(stemHeight, stemWidth, stemGap);

	}

}
