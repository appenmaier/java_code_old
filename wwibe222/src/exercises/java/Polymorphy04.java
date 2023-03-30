package exercises.java;

import java.util.ArrayList;
import exercises.java.dice.DiceGame02;
import exercises.java.dice.Player02;

public class Polymorphy04 {

  public static void main(String[] args) {

    ArrayList<Player02> players = new ArrayList<>();

    players.add(new Player02("Hans"));
    players.add(new Player02("Lisa"));
    players.add(new Player02("Peter"));
    DiceGame02 diceGame = new DiceGame02(players);

    diceGame.start();

  }

}
