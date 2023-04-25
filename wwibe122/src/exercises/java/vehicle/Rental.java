package exercises.java.vehicle;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 * 
 */
public class Rental implements Partner {

  private String name;
  private ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addAllVehicles(Vehicle... vehicles) {
    for (Vehicle v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  @Override
  public void print() {
    System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle v : vehicles) {
      v.print();
    }
  }

  public void transformAllTrucks() {
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        Truck t = (Truck) v;
        t.transform();
      }
    }
  }

}
