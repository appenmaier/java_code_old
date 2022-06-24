package exercises.java.dice.v2;

import java.util.Random;

/**
 * Spezialwuerfel: 4-5-6-Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class HighValueDice extends Dice {

	/*
	 * Konstruktoren
	 */
	public HighValueDice(int id) {
		super(id);
	}

	/*
	 * Methoden
	 */
	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(3) + 4;
	}

}
