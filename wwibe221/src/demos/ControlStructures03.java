package demos;

import java.util.Scanner;

/**
 * Mehrfachverzweigungen bzw. Fallunterscheidungen mit switch-case
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ControlStructures03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte R, G, oder B ein: ");
		char color = sc.next().charAt(0);

		String colorText = "";

		switch (color) {
		case 'r':
		case 'R':
			colorText = "rot";
			break;
		case 'g':
		case 'G':
			colorText = "gruen";
			break;
		case 'b':
		case 'B':
			colorText = "blau";
			break;
		default:
			System.err.println("Ungueltige Eingabe");
			break;
		}

		System.out.println("colorText: " + colorText);

		// ab Java 14
		colorText = switch (color) {
		case 'r', 'R' -> "rot";
		case 'g', 'G' -> "gruen";
		case 'b', 'B' -> "blau";
		default -> "";
		};

		System.out.println("colorText: " + colorText);

	}

}
