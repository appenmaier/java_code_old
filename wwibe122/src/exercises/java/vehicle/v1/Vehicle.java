package exercises.java.vehicle.v1;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 *
 */
public class Vehicle {

  /* Attribute */
  private String make;
  private String model;
  private int speed;

  /* Methoden */
  public void setMake(String make) {
    this.make = make;
  }

  public String getMake() {
    return make;
  }

  public void setModel(String model) {
    this.model = model;
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
