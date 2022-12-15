package exercises.java;

import exercises.java.creature.Creature02;
import exercises.java.creature.CreatureGame;

public class ClassDiagrams03 {

  public static void main(String[] args) {

    Creature02 zombie = new Creature02("Zombie", 2, 10);
    Creature02 vampire = new Creature02("Vampir", 4, 6);

    CreatureGame creatureGame = new CreatureGame(zombie, vampire);
    creatureGame.simulateFight();

  }

}
