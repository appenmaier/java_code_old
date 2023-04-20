package exercises.java.vehicle;

public final class Truck02 extends Vehicle06 {

  /* Attribute */
  private int cargo;
  private boolean isTransformed;

  /* Methoden */
  public Truck02(String make, String model, Engine engine, int cargo) {
    super(make, model, engine);
    this.cargo = cargo;
  }

  public int getCargo() {
    return cargo;
  }

  public boolean isTransformed() {
    return isTransformed;
  }

  @Override
  public void print() {
    System.out.println(
        getMake() + " " + getModel() + "(" + getEngine().getDescription() + ", " + cargo + "t)");
  }

  public void transform() {
    if (isTransformed) {
      isTransformed = false;
      System.out
          .println(getMake() + " " + getModel() + " verwandelt sich in einen Lastwagen zurück");
    } else {
      isTransformed = true;
      System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
    }
  }

}