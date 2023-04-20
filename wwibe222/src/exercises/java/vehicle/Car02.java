package exercises.java.vehicle;

/**
 * Auto
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public final class Car02 extends Vehicle06 {

  /* Attribute */
  private int seats;

  /* Methoden */
  public Car02(String make, String model, Engine engine, int seats) {
    super(make, model, engine);
    this.seats = seats;
  }

  public void doATurboBoost() {
    speed *= 2;
    System.out.println(getMake() + " " + getModel()
        + " macht einen TurboBoost und beschleunigt auf " + speed + " km/h");
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public void print() {
    System.out.println(getMake() + " " + getModel() + "(" + getEngine().getDescription() + ", "
        + seats + "Sitzplaetze)");
  }

}
