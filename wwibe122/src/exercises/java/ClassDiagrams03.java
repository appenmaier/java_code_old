package exercises.java;

import exercises.java.creature.Creature_v2;
import exercises.java.creature.CreatureGame;

public class ClassDiagrams03 {

  public static void main(String[] args) {

    Creature_v2 zombie = new Creature_v2("Zombie", 2, 10);
    Creature_v2 vampire = new Creature_v2("Vampir", 4, 6);

    CreatureGame creatureGame = new CreatureGame(zombie, vampire);
    creatureGame.simulateFight();

  }

}
