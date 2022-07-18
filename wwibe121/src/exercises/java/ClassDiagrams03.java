package exercises.java;

import exercises.java.creature.v2.Creature;
import exercises.java.creature.v2.CreatureGame;

/**
 * Uebungsaufgabe JAVA-43
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ClassDiagrams03 {

	public static void main(String[] args) {

		Creature zombie = new Creature("Zombie", 2, 10);
		Creature vampire = new Creature("Vampir", 4, 6);

		CreatureGame creatureGame = new CreatureGame(zombie, vampire);
		creatureGame.simulateFight();

	}

}
