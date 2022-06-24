package exercises.java.vehicle.v5;

/**
 * Auto
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Car extends Vehicle {

	/*
	 * Attribute
	 */
	/**
	 * Anzahl Sitzplaetze
	 */
	private int seats;

	/*
	 * Konstruktoren
	 */
	public Car(String make, String model, Engine engine, int seats) {
		super(make, model, engine);
		this.seats = seats;
	}

	/*
	 * Setter und Getter
	 */
	public int getSeats() {
		return seats;
	}

	/*
	 * Methoden
	 */
	/**
	 * Verdoppelt die Geschwindigkeit des Autos
	 */
	public void doATurboBoost() {
		speed *= 2;
		System.out.println(
				getMake() + " " + getModel() + " macht einen Turboboost und beschleunigt auf " + speed + " km/h");
	}

	/**
	 * Gibt alle Attribute des Autos auf der Konsole aus
	 */
	public void print() {
		// super.print();
		// System.out.println(seats + " Sitzplaetze");

		System.out.println(
				getMake() + " " + getModel() + " (" + getEngine().getDescription() + ", " + seats + " Sitzplaetze)");
	}

}
