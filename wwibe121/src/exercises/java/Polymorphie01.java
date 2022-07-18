package exercises.java;

import exercises.java.vehicle.v5.Car;
import exercises.java.vehicle.v5.Engine;
import exercises.java.vehicle.v5.Truck;
import exercises.java.vehicle.v5.Vehicle;

/**
 * Uebungsaufgabe JAVA-47
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Polymorphie01 {

	public static void main(String[] args) {

		int numberOfVehicles;
		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		car1.print();
		truck1.print();
		car2.print();

		car1.accelerate(50);
		truck1.transform();
		car1.doATurboBoost();
		truck1.transform();

	}

}
