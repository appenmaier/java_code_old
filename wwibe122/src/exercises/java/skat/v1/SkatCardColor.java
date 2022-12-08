package exercises.java.skat.v1;

/**
 * Spielfarbe (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public enum SkatCardColor {

  /* Aufzaehlungskonstanten */
  DIAMONDS("Karo"), HEARTS("Herz"), SPADE("Pik"), CLUBS("Kreuz");

  /* Attribute */
  private String description;

  /* Methoden */
  SkatCardColor(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
