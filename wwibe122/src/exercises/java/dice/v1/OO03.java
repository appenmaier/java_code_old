package exercises.java.dice.v1;

public class OO03 {

  public static void main(String[] args) {

    Dice dice1 = new Dice(1);

    System.out.println("ID - Wuerfelwert");
    for (int i = 0; i < 5; i++) {
      dice1.rollTheDice();
      System.out.println(dice1.getId() + " - " + dice1.getValue());
    }

  }

}
