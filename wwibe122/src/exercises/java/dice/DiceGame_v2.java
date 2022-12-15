package exercises.java.dice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Wuerfelspiel
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class DiceGame_v2 {

  /* Attribute */
  private DiceCup_v2 diceCup;
  private ArrayList<Dice_v2> dices;
  private ArrayList<Player_v2> players;
  private Scanner scanner;
  private int numberOfActivePlayers;

  /* Methoden */
  public DiceGame_v2(ArrayList<Player_v2> players) {
    diceCup = new DiceCup_v2();
    dices = new ArrayList<>();
    this.players = players;
    scanner = new Scanner(System.in);
    for (Player_v2 player : players) {
      player.setActive(true);
    }
    numberOfActivePlayers = players.size();
  }

  public void start() {
    while (numberOfActivePlayers >= 1) {
      for (Player_v2 player : players) {
        if (player.isActiv()) {
          move(player);
        }
      }
    }
    Player_v2 bestPlayer = players.get(0);
    for (Player_v2 player : players) {
      if (player.getScore() > bestPlayer.getScore()) {
        bestPlayer = player;
      }
    }
    System.out.println("Der Sieger heisst " + bestPlayer.getName() + " und hat "
        + bestPlayer.getScore() + " Punkte");
  }

  private void move(Player_v2 player) {
    int input;
    System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte");
    if (player.getSpecialAvailable()) {
      System.out.print(
          player.getName() + ", moechtest Du einmalig Spezialwuerfel verwenden (1=ja, 2=nein)?: ");
      input = scanner.nextInt();
      if (input == 1) {
        System.out.print(player.getName()
            + ", welche Spezialwuerfel moechtest Du verwenden (1=4-5-6-Wuerfel, 2=1-2-3-Wuerfel)?: ");
        input = scanner.nextInt();
        if (input == 1) {
          dices.add(new HighValueDice(4));
          dices.add(new HighValueDice(5));
          dices.add(new HighValueDice(6));
        } else {
          dices.add(new LowValueDice(7));
          dices.add(new LowValueDice(8));
          dices.add(new LowValueDice(9));
        }
        player.setSpecialAvailable(false);
      } else {
        dices.add(new Dice_v2(1));
        dices.add(new Dice_v2(2));
        dices.add(new Dice_v2(3));
      }
    } else {
      dices.add(new Dice_v2(1));
      dices.add(new Dice_v2(2));
      dices.add(new Dice_v2(3));
    }
    System.out.print(player.getName() + ", moechtest Du wuerfeln (true, false)?: ");
    if (scanner.nextBoolean()) {
      diceCup.rollTheDices(dices);
      int score = 0;
      for (Dice_v2 dice : dices) {
        score += dice.getValue();
      }
      System.out.println(player.getName() + " hat " + score + " Punkte");
      player.setScore(player.getScore() + score);
      System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte");
      if (player.getScore() > 50) {
        System.out.println(player.getName() + " hat verloren");
        player.setScore(0);
        player.setActive(false);
        numberOfActivePlayers--;
      }
    } else {
      player.setActive(false);
      numberOfActivePlayers--;
    }
    System.out.println();
    dices.clear();
  }

}
