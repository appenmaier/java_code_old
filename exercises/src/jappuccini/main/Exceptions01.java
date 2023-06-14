package jappuccini.main;

import jappuccini.model.Car;
import jappuccini.model.Engine;
import jappuccini.model.InvalidValueException;

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
