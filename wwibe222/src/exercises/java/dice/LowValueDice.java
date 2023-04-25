package exercises.java.dice;

import java.util.Random;

/**
 * Spezialwuerfel: 1-2-3-Wuerfel
 * 
 * @author Daniel Appenmaier
 * 
 */
public class LowValueDice extends Dice {

  public LowValueDice(int id) {
    super(id);
  }

  @Override
  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(3) + 1;
  }

}
