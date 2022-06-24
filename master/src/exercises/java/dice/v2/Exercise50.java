package exercises.java.dice.v2;

import java.util.ArrayList;

/**
 * Uebungsaufgabe JAVA-50
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise50 {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();

		players.add(new Player("Hans"));
		players.add(new Player("Lisa"));
		players.add(new Player("Peter"));
		DiceGame diceGame = new DiceGame(players);

		diceGame.start();

	}

}
