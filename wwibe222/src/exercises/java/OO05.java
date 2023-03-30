package exercises.java;

import java.util.ArrayList;
import exercises.java.dice.Dice;
import exercises.java.dice.DiceCup;

public class OO05 {

  public static void main(String[] args) {

    ArrayList<Dice> dices = new ArrayList<>();

    for (int i = 1; i <= 5; i++) {
      Dice dice = new Dice(i);
      dices.add(dice);
    }

    DiceCup diceCup = new DiceCup();

    System.out.println("ID - Wuerfelwert");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Wurf " + i);
      diceCup.rollTheDices(dices);
    }

  }

}
