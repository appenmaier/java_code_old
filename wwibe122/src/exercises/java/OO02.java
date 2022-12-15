package exercises.java;

import java.util.ArrayList;
import exercises.java.vehicle.Vehicle_v2;

public class OO02 {

  public static void main(String[] args) {

    ArrayList<Vehicle_v2> vehicles = new ArrayList<>();

    Vehicle_v2 vehicle1 = new Vehicle_v2("Porsche", "911");
    vehicles.add(vehicle1);

    Vehicle_v2 vehicle2 = new Vehicle_v2("MAN", "TGX");
    vehicles.add(vehicle2);

    Vehicle_v2 vehicle3 = new Vehicle_v2("Opel", "Zafira Life");
    vehicles.add(vehicle3);

    vehicle1.accelerate(50);
    vehicle1.accelerate(50);
    vehicle1.brake(30);

    for (int i = 0; i < vehicles.size(); i++) {
      Vehicle_v2 v = vehicles.get(i);
      v.print();
    }

  }

}
