package exercises.java;

import exercises.java.vehicle.Engine;
import exercises.java.vehicle.Vehicle04;

public class Enumerations01 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle04.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle04 vehicle1 = new Vehicle04("Porsche", "911", Engine.ELECTRO);
    Vehicle04 vehicle2 = new Vehicle04("MAN", "TGX", Engine.DIESEL);
    Vehicle04 vehicle3 = new Vehicle04("Opel", "Zafira Life", Engine.DIESEL);

    numberOfVehicles = Vehicle04.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();

  }

}
