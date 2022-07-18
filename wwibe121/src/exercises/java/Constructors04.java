package exercises.java;

import java.util.ArrayList;

import exercises.java.dice.v1.Dice;
import exercises.java.dice.v1.DiceCup;

/**
 * Uebungsaufgabe JAVA-32
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Constructors04 {

	public static void main(String[] args) {

		ArrayList<Dice> dices = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Dice dice = new Dice(i);
			dices.add(dice);
		}

		DiceCup diceCup = new DiceCup();

		System.out.println("ID - Wuerfelwert");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Wurf " + i);
			diceCup.rollTheDices(dices);
		}

	}

}
