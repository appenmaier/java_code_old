package exercises.java.skat.v1;

/**
 * Karte (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class SkatCard {

  /* Attribute */
  private SkatCardColor color;
  private SkatCardValue value;

  /* Methoden */
  public SkatCard(SkatCardColor color, SkatCardValue value) {
    this.color = color;
    this.value = value;
  }

  public SkatCardColor getColor() {
    return color;
  }

  public SkatCardValue getValue() {
    return value;
  }

  public String getCardDescription() {
    return color.getDescription() + " " + value.getDescription();
  }

}
