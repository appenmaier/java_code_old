package exercises.java.dice;

import java.util.Random;

/**
 * Spezialwuerfel: 1-2-3-Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class LowValueDice extends Dice_v2 {

  /* Methoden */
  public LowValueDice(int id) {
    super(id);
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(3) + 1;
  }

}
