package exercises.java.vehicle.v3;

public class OO07 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle vehicle1 = new Vehicle("Porsche", "911");
    Vehicle vehicle2 = new Vehicle("MAN", "TGX");
    Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");

    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();

  }

}
