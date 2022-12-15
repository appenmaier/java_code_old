package exercises.java;

import exercises.java.vehicle.Vehicle_v3;

public class OO07 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle_v3.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle_v3 vehicle1 = new Vehicle_v3("Porsche", "911");
    Vehicle_v3 vehicle2 = new Vehicle_v3("MAN", "TGX");
    Vehicle_v3 vehicle3 = new Vehicle_v3("Opel", "Zafira Life");

    numberOfVehicles = Vehicle_v3.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();

  }

}
