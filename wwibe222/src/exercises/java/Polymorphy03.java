package exercises.java;

import exercises.java.vehicle.Car;
import exercises.java.vehicle.Engine;
import exercises.java.vehicle.Rental;
import exercises.java.vehicle.Truck;

public class Polymorphy03 {

  public static void main(String[] args) {

    Rental rental = new Rental("Fahrzeugvermietung Mueller");

    Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    rental.addVehicle(car1);
    rental.addVehicle(truck1);
    rental.addVehicle(car2);

    rental.transformAllTrucks();

  }

}
