package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.java.vehicle.v7.Car;
import exercises.java.vehicle.v7.Engine;
import exercises.java.vehicle.v7.InvalidValueException;
import exercises.java.vehicle.v7.Rental;
import exercises.java.vehicle.v7.Truck;
import exercises.java.vehicle.v7.Vehicle;

/**
 * Testklasse fuer Rental
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class RentalTest {

	private static Rental rental;

	@BeforeEach
	void setUp() {
		rental = new Rental("Sixxt");
		rental.addAllVehicles(new Car("Porsche", "911", Engine.ELECTRO, 2),
				new Car("Opel", "Zafira Life", Engine.DIESEL, 7), new Truck("MAN", "TGX", Engine.DIESEL, 40));
	}

	@Test
	void testTransformAllTrucks() {
		rental.transformAllTrucks();
		for (Vehicle v : rental.getVehicles()) {
			if (v instanceof Truck t) {
				assertTrue(t.isTransformed());
			}
		}
		rental.transformAllTrucks();
		for (Vehicle v : rental.getVehicles()) {
			if (v instanceof Truck t) {
				assertTrue(!t.isTransformed());
			}
		}
	}

	@Test
	void testAccelerateAllVehicles() {
		assertThrows(InvalidValueException.class, () -> rental.accelerateAllVehicles(-10));
	}

}
