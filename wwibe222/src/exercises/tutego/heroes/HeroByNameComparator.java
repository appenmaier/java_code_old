package exercises.tutego.heroes;

import java.util.Comparator;
import exercises.tutego.heroes.Heroes.Hero;

public class HeroByNameComparator implements Comparator<Hero> {

  @Override
  public int compare(Hero o1, Hero o2) {
    return o1.name.compareTo(o2.name);
  }

}
