package exercises.java.vehicle.v4;

/**
 * Motor
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public enum Engine {

  /* Aufzaehlungskonstanten */
  DIESEL("Diesel"), PETROL("Benzin"), GAS("Gas"), ELECTRO("Elektro");

  /* Attribute */
  private String description;

  /* Methoden */
  Engine(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
