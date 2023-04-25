package exercises.tutego.heroes;

import java.util.Comparator;
import exercises.tutego.heroes.Heroes.Hero;

public class HeroByYearFirstAppearanceComparator implements Comparator<Hero> {

  @Override
  public int compare(Hero o1, Hero o2) {
    return Integer.compare(o1.yearFirstAppearance, o2.yearFirstAppearance);
  }

}
