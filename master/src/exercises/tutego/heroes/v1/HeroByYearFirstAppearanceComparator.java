package exercises.tutego.heroes.v1;

import java.util.Comparator;

import exercises.tutego.heroes.v1.Heroes.Hero;

/**
 * HeroByYearFirstAppearanceComparator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HeroByYearFirstAppearanceComparator implements Comparator<Hero> {

	public int compare(Hero o1, Hero o2) {
		return Integer.compare(o1.yearFirstAppearance, o2.yearFirstAppearance);
	}

}
