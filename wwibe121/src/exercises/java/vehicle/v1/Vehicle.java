package exercises.java.vehicle.v1;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 1.0
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

	/*
	 * Setter und Getter
	 */
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
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
