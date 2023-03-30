package exercises.java.dice;

import java.util.Random;

/**
 * Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Dice02 {

  /* Attribute */
  private int id;
  protected int value;

  /* Methoden */
  public Dice02(int id) {
    this.id = id;
    rollTheDice();
  }

  public int getId() {
    return id;
  }

  public int getValue() {
    return value;
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(6) + 1;
  }

}
