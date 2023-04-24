package demos;

import demos.box.Box;
import demos.box.GenericBox;
import exercises.java.vehicle.Car02;
import exercises.java.vehicle.Engine;

/**
 * Java Generics
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaGenerics01 {

  public static void main(String[] args) {

    Box box = new Box();
    box.setContent(42);
    box.setContent(new Car02("Porsche", "911", Engine.ELECTRO, 2));
    box.setContent("Fuenf");

    if (box.getContent() instanceof Car02) {
      Car02 car = (Car02) box.getContent();
      car.getMake();
    }

    GenericBox<Integer> integerBox = new GenericBox<>();
    integerBox.setContent(42);
    int number = integerBox.getContent();
    System.out.println(number);

    GenericBox<Car02> carBox = new GenericBox<>();
    carBox.setContent(new Car02("Porsche", "911", Engine.ELECTRO, 2));
    Car02 car = carBox.getContent();
    car.getMake();

  }

}
