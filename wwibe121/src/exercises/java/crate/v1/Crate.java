package exercises.java.crate.v1;

/**
 * Getraenkekiste
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Crate {

	/*
	 * Attribute
	 */
	private Bottle box1;
	private Bottle box2;
	private Bottle box3;
	private Bottle box4;
	private Bottle box5;
	private Bottle box6;

	/*
	 * Methoden
	 */
	public void insertBottle(Bottle bottle, int box) {
		switch (box) {
		case 1 -> box1 = bottle;
		case 2 -> box2 = bottle;
		case 3 -> box3 = bottle;
		case 4 -> box4 = bottle;
		case 5 -> box5 = bottle;
		case 6 -> box6 = bottle;
		}
	}

	public Bottle takeBottle(int box) {
		return switch (box) {
		case 1 -> box1;
		case 2 -> box2;
		case 3 -> box3;
		case 4 -> box4;
		case 5 -> box5;
		case 6 -> box6;
		default -> null;
		};
	}

}
