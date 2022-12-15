package exercises.java;

import exercises.java.vehicle.Vehicle03;

public class OO07 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle03.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle03 vehicle1 = new Vehicle03("Porsche", "911");
    Vehicle03 vehicle2 = new Vehicle03("MAN", "TGX");
    Vehicle03 vehicle3 = new Vehicle03("Opel", "Zafira Life");

    numberOfVehicles = Vehicle03.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();

  }

}
