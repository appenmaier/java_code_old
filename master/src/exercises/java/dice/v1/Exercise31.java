package exercises.java.dice.v1;

import java.util.ArrayList;

/**
 * Uebungsaufgabe JAVA-31
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise31 {

	public static void main(String[] args) {

		ArrayList<Dice> dices = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Dice dice = new Dice(i);
			dices.add(dice);
		}

		System.out.println("ID - Wuerfelwert");
		for (int i = 0; i < dices.size(); i++) {
			Dice dice = dices.get(i);
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}

	}

}
