package exercises.java;

import java.util.ArrayList;
import exercises.java.vehicle.Vehicle;

public class OO02 {

  public static void main(String[] args) {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    /* Outdated */
    // Vehicle vehicle1 = new Vehicle("Porsche", "911");
    // vehicles.add(vehicle1);

    /* Outdated */
    // Vehicle vehicle2 = new Vehicle("MAN", "TGX");
    // vehicles.add(vehicle2);

    /* Outdated */
    // Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");
    // vehicles.add(vehicle3);

    /* Outdated */
    // vehicle1.accelerate(50);
    // vehicle1.accelerate(50);
    // vehicle1.brake(30);

    for (int i = 0; i < vehicles.size(); i++) {
      Vehicle v = vehicles.get(i);
      v.print();
    }

  }

}
