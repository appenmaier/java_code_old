package exercises.java;

import exercises.java.vehicle.Car;
import exercises.java.vehicle.Engine;
import exercises.java.vehicle.InvalidValueException;

public class Exceptions01 {

  public static void main(String[] args) {

    Car car = new Car("Porsche", "911", Engine.ELECTRO, 2);

    try {
      car.accelerate(-10);
    } catch (InvalidValueException e) {
      System.err.println(e.getMessage());
    }

  }

}
