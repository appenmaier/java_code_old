package exercises.java;

import java.util.ArrayList;
import exercises.java.vehicle.Vehicle02;

public class OO02 {

  public static void main(String[] args) {

    ArrayList<Vehicle02> vehicles = new ArrayList<>();

    Vehicle02 vehicle1 = new Vehicle02("Porsche", "911");
    vehicles.add(vehicle1);

    Vehicle02 vehicle2 = new Vehicle02("MAN", "TGX");
    vehicles.add(vehicle2);

    Vehicle02 vehicle3 = new Vehicle02("Opel", "Zafira Life");
    vehicles.add(vehicle3);

    vehicle1.accelerate(50);
    vehicle1.accelerate(50);
    vehicle1.brake(30);

    for (int i = 0; i < vehicles.size(); i++) {
      Vehicle02 v = vehicles.get(i);
      v.print();
    }

  }

}
