package exercises.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-12
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Cases04 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Spieler 1, gib bitte Deinen Tipp ein: ");
		int tip1 = sc.nextInt();

		System.out.print("Spieler 2, gib bitte Deinen Tipp ein: ");
		int tip2 = sc.nextInt();

		// int randomNumber = (int) (Math.random() * 100);
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(100) + 1;

		int distance1 = Math.abs(randomNumber - tip1);
		int distance2 = Math.abs(randomNumber - tip2);

		if (distance1 > distance2) {
			System.out.println("Zufallszahl: " + randomNumber + ", Spieler 2 gewinnt");
		} else if (distance2 > distance1) {
			System.out.println("Zufallszahl: " + randomNumber + ", Spieler 1 gewinnt");
		} else {
			System.out.println("Zufallszahl: " + randomNumber + ", beide Spieler gewinnen");
		}

	}

}
