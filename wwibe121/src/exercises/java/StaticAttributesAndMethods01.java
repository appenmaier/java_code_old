package exercises.java;

import exercises.java.vehicle.v3.Vehicle;

/**
 * Uebungsaufgabe JAVA-34
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class StaticAttributesAndMethods01 {

	public static void main(String[] args) {

		int numberOfVehicles;
		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		Vehicle vehicle1 = new Vehicle("Porsche", "911");
		Vehicle vehicle2 = new Vehicle("MAN", "TGX");
		Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");

		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		vehicle1.print();
		vehicle2.print();
		vehicle3.print();

	}

}
