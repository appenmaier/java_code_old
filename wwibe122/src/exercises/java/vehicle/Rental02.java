package exercises.java.vehicle;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Rental02 {

  /* Attribute */
  private String name;
  private ArrayList<Vehicle06> vehicles;

  /* Methoden */
  public Rental02(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addAllVehicles(Vehicle06... vehicles) {
    for (Vehicle06 v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void addVehicle(Vehicle06 vehicle) {
    vehicles.add(vehicle);
  }

  public void print() {
    System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle06 v : vehicles) {
      v.print();
    }
  }

  public void transformAllTrucks() {
    for (Vehicle06 v : vehicles) {
      if (v instanceof Truck02) {
        Truck02 t = (Truck02) v;
        t.transform();
      }
    }
  }

}
