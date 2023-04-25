package exercises.java;

import exercises.java.vehicle.Vehicle;

public class OO07 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    /* Outdated */
    // Vehicle vehicle1 = new Vehicle("Porsche", "911");
    // Vehicle vehicle2 = new Vehicle("MAN", "TGX");
    // Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");

    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    /* Outdated */
    // vehicle1.print();
    // vehicle2.print();
    // vehicle3.print();

  }

}
