package demos;

import java.util.Scanner;

/**
 * Bedingte Zuweisungen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ControlStructures02 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int age;

		System.out.print("Gib bitte Dein Alter ein: ");
		age = sc.nextInt();

		String text = "Du bist ";

		if (age >= 18) {
			text += "volljaehrig";
		} else {
			text += "minderjaehrig";
		}

		System.out.println(text);

		/*
		 * Kurzschreibweise
		 */
		String text2 = "Du bist ";

		text2 += (age >= 18) ? "volljaehrig" : "minderjaehrig";

		System.out.println(text2);

	}

}
