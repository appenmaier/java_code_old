package exercises.tutego.heroes.v1;

import java.util.Comparator;

import exercises.tutego.heroes.v1.Heroes.Hero;

/**
 * HeroByNameComparator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HeroByNameComparator implements Comparator<Hero> {

	public int compare(Hero o1, Hero o2) {
		return o1.name.compareTo(o2.name);
	}

}
