package exercises.java.dice.v2;

import java.util.Random;

/**
 * Spezialwuerfel: 1-2-3-Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class LowValueDice extends Dice {

	/*
	 * Konstruktoren
	 */
	public LowValueDice(int id) {
		super(id);
	}

	/*
	 * Methoden
	 */
	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(3) + 1;
	}

}
