package exercises.java;

import java.util.ArrayList;

import exercises.java.dice.v2.DiceGame;
import exercises.java.dice.v2.Player;

/**
 * Uebungsaufgabe JAVA-50
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Polymorphie04 {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();

		players.add(new Player("Hans"));
		players.add(new Player("Lisa"));
		players.add(new Player("Peter"));
		DiceGame diceGame = new DiceGame(players);

		diceGame.start();

	}

}
