package exercises.java.dice.v1;

import java.util.ArrayList;

/**
 * Wuerfelbecher
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class DiceCup {

  /* Methoden */
  public void rollTheDices(ArrayList<Dice> dices) {
    for (int i = 0; i < dices.size(); i++) {
      Dice dice = dices.get(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

  public void rollTheDices(Dice[] dices) {
    for (int i = 0; i < dices.length; i++) {
      Dice dice = dices[i];
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

}
