package exercises.java.vehicle.v4;

/**
 * Uebungsaufgabe JAVA-39
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise39 {

	public static void main(String[] args) {

		int numberOfVehicles;
		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		Vehicle vehicle1 = new Vehicle("Porsche", "911", Engine.ELECTRO);
		Vehicle vehicle2 = new Vehicle("MAN", "TGX", Engine.DIESEL);
		Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life", Engine.DIESEL);

		numberOfVehicles = Vehicle.getNumberOfVehicles();
		System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

		vehicle1.print();
		vehicle2.print();
		vehicle3.print();

	}

}
