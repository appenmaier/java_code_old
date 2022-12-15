package exercises.java.creature;

/**
 * Kreaturenspiel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class CreatureGame {

  /* Attribute */
  private Creature_v2 creature1;
  private Creature_v2 creature2;
  private int noRounds;

  /* Methoden */
  public CreatureGame(Creature_v2 creature1, Creature_v2 creature2) {
    this.creature1 = creature1;
    this.creature2 = creature2;
  }

  private void print() {
    System.out.print("Runde " + noRounds + ": ");
    creature1.print();
    System.out.print(", ");
    creature2.print();
    System.out.println();
  }

  private boolean move(Creature_v2 creature1, Creature_v2 creature2) {
    return creature1.attackCreature(creature2);
  }

  public void simulateFight() {
    noRounds = 1;
    while (true) {
      print();
      if (move(creature1, creature2)) {
        break;
      }
      if (move(creature2, creature1)) {
        break;
      }
      System.out.println();
      noRounds++;
    }
  }

}
