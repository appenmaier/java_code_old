package exercises.java.vehicle;

/**
 * Auto
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Car extends Vehicle_v5 {

  /* Attribute */
  private int seats;

  /* Methoden */
  public Car(String make, String model, Engine engine, int seats) {
    super(make, model, engine);
    this.seats = seats;
  }

  public int getSeats() {
    return seats;
  }

  public void doATurboBoost() {
    speed *= 2;
    System.out.println(getMake() + " " + getModel()
        + " macht einen TurboBoost und beschleunigt auf " + speed + " km/h");
  }

  public void print() {
    System.out.println(getMake() + " " + getModel() + "(" + getEngine().getDescription() + ", "
        + seats + "Sitzplaetze)");
  }

}
