package exercises.java.dice;

import java.util.ArrayList;

/**
 * Wuerfelbecher
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class DiceCup02 {

  /* Methoden */
  public void rollTheDices(ArrayList<Dice02> dices) {
    for (int i = 0; i < dices.size(); i++) {
      Dice02 dice = dices.get(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

  public void rollTheDices(Dice02[] dices) {
    for (int i = 0; i < dices.length; i++) {
      Dice02 dice = dices[i];
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

}
