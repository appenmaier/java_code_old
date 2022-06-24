package exercises.java.vehicle.v3;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public class Vehicle {

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
	 * Geschwindigkeit
	 */
	private double speed;

	/**
	 * Anzahl Fahrzeuge
	 */
	private static int numberOfVehicles;

	/*
	 * Konstruktoren
	 */
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
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

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	/*
	 * Methoden
	 */
	public void accelerate(int value) {
		speed += value;
		System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
	}

	public void brake(int value) {
		speed -= value;
		System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
	}

	public void print() {
		System.out.println(make + " " + model);
	}

}
