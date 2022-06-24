package exercises.java.dice.v2;

/**
 * Spieler
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Player {

	/*
	 * Attribute
	 */
	private String name;
	private int score;
	private boolean isActive;
	private boolean specialAvailable;

	/*
	 * Konstruktoren
	 */
	public Player(String name) {
		this.name = name;
		isActive = true;
		specialAvailable = true;
	}

	/*
	 * Setter und Getter
	 */
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isActiv() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getSpecialAvailable() {
		return specialAvailable;
	}

	public void setSpecialAvailable(boolean specialAvailable) {
		this.specialAvailable = specialAvailable;
	}

}
