package exercises.java.vehicle;

/**
 * Motor
 * 
 * @author Daniel Appenmaier
 * 
 */
public enum Engine {

  DIESEL("Diesel"), PETROL("Benzin"), GAS("Gas"), ELECTRO("Elektro");

  private String description;

  Engine(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
