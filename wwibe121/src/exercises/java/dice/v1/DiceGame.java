package exercises.java.dice.v1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Wuerfelspiel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class DiceGame {

	/*
	 * Attribute
	 */
	private DiceCup diceCup;
	private ArrayList<Dice> dices;
	private ArrayList<Player> players;
	private Scanner scanner;
	private int numberOfActivePlayers;

	/*
	 * Methoden
	 */
	public DiceGame(ArrayList<Player> players) {
		diceCup = new DiceCup();
		dices = new ArrayList<>();
		this.players = players;
		scanner = new Scanner(System.in);
		for (Player player : players) {
			player.setActive(true);
		}
		numberOfActivePlayers = players.size();
	}

	public void start() {
		while (numberOfActivePlayers >= 1) {
			for (Player player : players) {
				if (player.isActiv()) {
					move(player);
				}
			}
		}
		Player bestPlayer = players.get(0);
		for (Player player : players) {
			if (player.getScore() > bestPlayer.getScore()) {
				bestPlayer = player;
			}
		}
		System.out
				.println("Der Sieger heisst " + bestPlayer.getName() + " und hat " + bestPlayer.getScore() + " Punkte");
	}

	private void move(Player player) {
		dices.add(new Dice(1));
		dices.add(new Dice(2));
		dices.add(new Dice(3));
		System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte");
		System.out.print(player.getName() + ", moechtest Du wuerfeln (true, false)?: ");
		if (scanner.nextBoolean()) {
			diceCup.rollTheDices(dices);
			int score = 0;
			for (Dice dice : dices) {
				score += dice.getValue();
			}
			System.out.println(player.getName() + " hat " + score + " Punkte");
			player.setScore(player.getScore() + score);
			System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte");
			if (player.getScore() > 50) {
				System.out.println(player.getName() + " hat verloren");
				player.setScore(0);
				player.setActive(false);
				numberOfActivePlayers--;
			}
		} else {
			player.setActive(false);
			numberOfActivePlayers--;
		}
		System.out.println();
		dices.clear();
	}

}
