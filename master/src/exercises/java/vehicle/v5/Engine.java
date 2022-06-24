package exercises.java.vehicle.v5;

/**
 * Motor
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public enum Engine {

	/*
	 * Aufzaehlungskonstanten
	 */
	DIESEL("Diesel"), PETROL("Benzin"), GAS("Gas"), ELECTRO("Elektro");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Konstruktoren
	 */
	Engine(String description) {
		this.description = description;
	}

	/*
	 * Setter und Getter
	 */
	public String getDescription() {
		return description;
	}

}
