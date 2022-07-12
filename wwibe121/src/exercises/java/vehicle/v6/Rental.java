package exercises.java.vehicle.v6;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Rental {

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
