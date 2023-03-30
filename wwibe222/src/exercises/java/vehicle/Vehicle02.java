package exercises.java.vehicle;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Vehicle02 {

  /* Attribute */
  private String make;
  private String model;
  private int speed;

  /* Methoden */
  public Vehicle02(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
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
    System.out.println(make + " " + model);
  }

}
