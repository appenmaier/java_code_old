package exercises.java.vehicle.v2;

/**
 * Uebungsaufgabe JAVA-29
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise29 {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Porsche", "911");

		vehicle.accelerate(30);
		vehicle.accelerate(30);
		vehicle.brake(20);
		vehicle.accelerate(40);

	}

}
