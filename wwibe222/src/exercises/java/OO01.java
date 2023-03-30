package exercises.java;

import java.util.ArrayList;
import exercises.java.vehicle.Vehicle;

public class OO01 {

  public static void main(String[] args) {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    Vehicle vehicle1 = new Vehicle();
    vehicle1.setMake("Porsche");
    vehicle1.setModel("911");
    vehicles.add(vehicle1);

    Vehicle vehicle2 = new Vehicle();
    vehicle2.setMake("MAN");
    vehicle2.setModel("TGX");
    vehicles.add(vehicle2);

    Vehicle vehicle3 = new Vehicle();
    vehicle3.setMake("Opel");
    vehicle3.setModel("Zafira Life");
    vehicles.add(vehicle3);

    vehicle1.accelerate(50);
    vehicle1.accelerate(50);
    vehicle1.brake(30);

    for (int i = 0; i < vehicles.size(); i++) {
      Vehicle v = vehicles.get(i);
      v.print();
    }

  }

}
