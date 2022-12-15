package exercises.java.vehicle;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Rental {

  /* Attribute */
  private String name;
  private ArrayList<Vehicle05> vehicles;

  /* Methoden */
  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addVehicle(Vehicle05 vehicle) {
    vehicles.add(vehicle);
  }

  public void addAllVehicles(Vehicle05... vehicles) {
    for (Vehicle05 v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void transformAllTrucks() {
    for (Vehicle05 v : vehicles) {
      if (v instanceof Truck) {
        Truck t = (Truck) v;
        t.transform();
      }
    }
  }

  public void print() {
    System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle05 v : vehicles) {
      v.print();
    }
  }

}
