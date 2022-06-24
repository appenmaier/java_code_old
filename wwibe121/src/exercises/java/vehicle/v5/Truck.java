package exercises.java.vehicle.v5;

/**
 * Lastwagen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Truck extends Vehicle {

	/*
	 * Attribute
	 */
	/**
	 * Frachtkapazitaet
	 */
	private int cargo;

	/**
	 * transfomiert?
	 */
	private boolean isTransformed;

	/*
	 * Konstruktoren
	 */
	public Truck(String make, String model, Engine engine, int cargo) {
		super(make, model, engine);
		this.cargo = cargo;
	}

	/*
	 * Setter und Getter
	 */
	public int getCargo() {
		return cargo;
	}

	public boolean isTransformed() {
		return isTransformed;
	}

	/*
	 * Methoden
	 */
	/**
	 * Verwandelt den Lastwagen in einen Autobot und zurueck
	 */
	public void transform() {
		if (isTransformed) {
			isTransformed = false;
			System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Lastwagen zurueck");
		} else {
			isTransformed = true;
			System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
		}
	}

	/**
	 * Gibt alle Attribute des Lastwagens auf der Konsole aus
	 */
	public void print() {
		System.out.println(getMake() + " " + getModel() + " (" + getEngine().getDescription() + ", " + cargo + "t)");
	}

}
