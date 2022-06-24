package exercises.java.vehicle.v4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-40
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise40 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("../documents/vehicles.txt");

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] tokens = line.split(";");

			String make = tokens[0];
			String model = tokens[1];
			String engineDescription = tokens[2];
			Engine engine = null;

			for (Engine e : Engine.values()) {
				if (e.getDescription().equals(engineDescription)) {
					engine = e;
					break;
				}
			}

			Vehicle vehicle = new Vehicle(make, model, engine);
			vehicles.add(vehicle);
		}

		for (Vehicle v : vehicles) {
			v.print();
		}

		sc.close();

	}

}
