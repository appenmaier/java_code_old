package exercises.java.vehicle.v6;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 6.0
 */
public abstract class Vehicle {

	/*
	 * Attribute
	 */
	/**
	 * Hersteller
	 */
	private String make;

	/**
	 * Modell
	 */
	private String model;

	/**
	 * Motor
	 */
	private Engine engine;

	/**
	 * Geschwindigkeit
	 */
	protected double speed;

	/**
	 * Anzahl Fahrzeuge
	 */
	private static int numberOfVehicles;

	/*
	 * Konstruktoren
	 */
	public Vehicle(String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		numberOfVehicles++;
	}

	/*
	 * Setter und Getter
	 */
	// public void setMake(String make) {
	// this.make = make;
	// }

	// public void setModel(String model) {
	// this.model = model;
	// }

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	/*
	 * Methoden
	 */
	public final void accelerate(int value) {
		speed += value;
		System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
	}

	public final void brake(int value) {
		speed -= value;
		System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
	}

	public abstract void print();

}
