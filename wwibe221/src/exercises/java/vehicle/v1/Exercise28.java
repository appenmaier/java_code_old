package exercises.java.vehicle.v1;

/**
 * Uebungsaufgabe JAVA-28
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise28 {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();

		vehicle.setMake("Porsche");
		vehicle.setModel("911");

		vehicle.accelerate(30);
		vehicle.accelerate(30);
		vehicle.brake(20);
		vehicle.accelerate(40);

	}

}
