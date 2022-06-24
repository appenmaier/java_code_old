package exercises.java.creature.v1;

/**
 * Uebungsaufgabe JAVA-33
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise33 {

	public static void main(String[] args) {

		Creature zombie = new Creature("Zombie", 2, 10);
		Creature vampire = new Creature("Vampir", 4, 6);

		zombie.attackCreature(vampire);
		vampire.attackCreature(zombie);
		zombie.attackCreature(vampire);
		vampire.attackCreature(zombie);

	}

}
