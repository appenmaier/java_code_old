package exercises.java.vehicle.v7;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public class Rental implements Partner {

	/*
	 * Attribute
	 */
	/**
	 * Name
	 */
	private String name;

	/**
	 * Fahrzeugliste
	 */
	private ArrayList<Vehicle> vehicles;

	/*
	 * Konstruktoren
	 */
	public Rental(String name) {
		this.name = name;
		vehicles = new ArrayList<>();
	}

	/*
	 * Methoden
	 */
	/**
	 * Fuegt der Fahrzeugliste ein Fahrzeug hinzu
	 * 
	 * @param vehicle Fahrzeug
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	/**
	 * Fuegt der Fahrzeugliste mehrere Fahrzeuge hinzu
	 * 
	 * @param vehicles Fahrzeuge
	 */
	public void addAllVehicles(Vehicle... vehicles) {
		for (Vehicle v : vehicles) {
			this.vehicles.add(v);
		}
	}

	/**
	 * Wandelt alle Lastwagen der Fahrzeugvermietung in Autobots um und zurueck
	 * 
	 */
	public void transformAllTrucks() {
		for (Vehicle c : vehicles) {
			if (c instanceof Truck) {
				Truck t = (Truck) c;
				t.transform();
			}
		}
	}

	/**
	 * Beschleunigt alle Fahrzeuge um den eingehenden Wert
	 * 
	 * @param value Wert
	 * @throws InvalidValueException
	 */
	public void accelerateAllVehicles(int value) throws InvalidValueException {
		for (Vehicle c : vehicles) {
			c.accelerate(value);
		}
	}

	/**
	 * Gibt alle Fahrzeuge als Liste zurueck
	 */
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	/**
	 * Gibt alle Attribute der Fahrzeugvermietung auf der Konsole aus
	 */
	public void print() {
		System.out.println(name);
		System.out.println("Unsere Fahrzeuge: ");
		for (Vehicle v : vehicles) {
			v.print();
		}
	}

}
