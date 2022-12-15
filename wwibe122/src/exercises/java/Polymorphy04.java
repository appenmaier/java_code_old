package exercises.java;

import java.util.ArrayList;
import exercises.java.dice.DiceGame_v2;
import exercises.java.dice.Player_v2;

public class Polymorphy04 {

  public static void main(String[] args) {

    ArrayList<Player_v2> players = new ArrayList<>();

    players.add(new Player_v2("Hans"));
    players.add(new Player_v2("Lisa"));
    players.add(new Player_v2("Peter"));
    DiceGame_v2 diceGame = new DiceGame_v2(players);

    diceGame.start();

  }

}
