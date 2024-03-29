package exercises.java.vehicle;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 6.0
 * 
 */
public abstract class Vehicle {

  private static int numberOfVehicles;

  public static int getNumberOfVehicles() {
    return numberOfVehicles;
  }

  private String make;
  private String model;
  private Engine engine;
  protected int speed;

  public Vehicle(String make, String model, Engine engine) {
    this.make = make;
    this.model = model;
    this.engine = engine;
    numberOfVehicles++;
  }

  public final void accelerate(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException("Invalid Value: " + value);
    }

    speed += value;
    System.out.println(make + " " + model + " beschleunigt auf " + speed + " km/h");
  }

  public final void brake(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException("Invalid Value: " + value);
    }

    speed -= value;
    System.out.println(make + " " + model + " bremst auf " + speed + " km/h ab");
  }

  public Engine getEngine() {
    return engine;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getSpeed() {
    return speed;
  }

  public abstract void print();

}
