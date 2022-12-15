package exercises.java.dice;

import java.util.ArrayList;

/**
 * Wuerfelbecher
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class DiceCup_v2 {

  /* Methoden */
  public void rollTheDices(ArrayList<Dice_v2> dices) {
    for (int i = 0; i < dices.size(); i++) {
      Dice_v2 dice = dices.get(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

  public void rollTheDices(Dice_v2[] dices) {
    for (int i = 0; i < dices.length; i++) {
      Dice_v2 dice = dices[i];
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

}
