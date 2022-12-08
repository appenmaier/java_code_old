package exercises.java.vehicle.v5;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 * 
 */
public class Vehicle {

  /* Attribute */
  private String make;
  private String model;
  private Engine engine;
  protected int speed;

  private static int numberOfVehicles;

  /* Methoden */
  public Vehicle(String make, String model, Engine engine) {
    this.make = make;
    this.model = model;
    this.engine = engine;
    numberOfVehicles++;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }

  public static int getNumberOfVehicles() {
    return numberOfVehicles;
  }

  public void accelerate(int value) {
    speed += value;
    System.out.println(make + " " + model + " beschleunigt auf " + speed + " km/h");
  }

  public void brake(int value) {
    speed -= value;
    System.out.println(make + " " + model + " bremst auf " + speed + " km/h ab");
  }

  public int getSpeed() {
    return speed;
  }

  public void print() {
    System.out.println(make + " " + model + " (" + engine.getDescription() + ")");
  }

}
