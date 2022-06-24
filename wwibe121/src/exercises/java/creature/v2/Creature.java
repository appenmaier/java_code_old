package exercises.java.creature.v2;

/**
 * Kreatur
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Creature {

	/*
	 * Attribute
	 */
	private String name;
	private int attackValue;
	private int hitpoints;

	/*
	 * Konstruktoren
	 */
	public Creature(String name, int attackValue, int hitpoints) {
		this.name = name;
		this.attackValue = attackValue;
		this.hitpoints = hitpoints;
	}

	/*
	 * Setter und Getter
	 */
	public String getName() {
		return name;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	/*
	 * Methoden
	 */
	public boolean attackCreature(Creature creature) {
		System.out.println(this.name + " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden");
		if (this.attackValue >= creature.hitpoints) {
			creature.hitpoints = 0;
			System.out.println(creature.name + " wurde vernichtet");
			return true;
		} else {
			creature.hitpoints -= this.attackValue;
			System.out.println(creature.name + " hat noch " + creature.hitpoints + " Lebenspunkte");
			return false;
		}
	}

	public void print() {
		System.out.print(name + " (" + attackValue + " - " + hitpoints + ")");
	}

}