package exercises.java;

import exercises.java.vehicle.Engine;
import exercises.java.vehicle.Vehicle_v4;

public class Enumerations01 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle_v4.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle_v4 vehicle1 = new Vehicle_v4("Porsche", "911", Engine.ELECTRO);
    Vehicle_v4 vehicle2 = new Vehicle_v4("MAN", "TGX", Engine.DIESEL);
    Vehicle_v4 vehicle3 = new Vehicle_v4("Opel", "Zafira Life", Engine.DIESEL);

    numberOfVehicles = Vehicle_v4.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();

  }

}
