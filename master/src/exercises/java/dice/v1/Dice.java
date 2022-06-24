package exercises.java.dice.v1;

import java.util.Random;

/**
 * Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Dice {

	/*
	 * Attribute
	 */
	private int id;
	private int value;

	/*
	 * Konstruktoren
	 */
	public Dice(int id) {
		this.id = id;
		rollTheDice();
	}

	/*
	 * Setter und Getter
	 */
	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	/*
	 * Methoden
	 */
	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}

}
