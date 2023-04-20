package exercises.java;

import exercises.java.vehicle.Car02;
import exercises.java.vehicle.Engine;
import exercises.java.vehicle.Rental03;
import exercises.java.vehicle.TravelAgency;
import exercises.java.vehicle.Truck02;

public class Interfaces01 {

  public static void main(String[] args) {

    TravelAgency agency = new TravelAgency("Reisebuero Schmidt");

    Rental03 rental = new Rental03("Fahrzeugvermietung Mueller");

    Car02 car1 = new Car02("Porsche", "911", Engine.ELECTRO, 2);
    Truck02 truck1 = new Truck02("MAN", "TGX", Engine.DIESEL, 20);
    Car02 car2 = new Car02("Opel", "Zafira Life", Engine.DIESEL, 7);

    rental.addVehicle(car1);
    rental.addVehicle(truck1);
    rental.addVehicle(car2);

    agency.addPartner(rental);

    agency.print();

  }

}
