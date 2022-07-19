package exercises.tutego;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import exercises.tutego.heroes.v1.HeroByNameComparator;
import exercises.tutego.heroes.v1.HeroByYearFirstAppearanceComparator;
import exercises.tutego.heroes.v1.Heroes;
import exercises.tutego.heroes.v1.Heroes.Hero;

/**
 * https://tutego.de/javabuch/aufgaben/javalib.html Aufgabe Javalib-1.2.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseJavalib123 {

	public static void main(String[] args) {
		List<Hero> heroes = new ArrayList<>(Heroes.ALL);

		Comparator<Hero> yearFirstAppearanceComparator = new HeroByYearFirstAppearanceComparator();
		Comparator<Hero> nameComparator = new HeroByNameComparator();
		Comparator<Hero> comparator = yearFirstAppearanceComparator.thenComparing(nameComparator);

		heroes.sort(comparator);

		heroes.forEach(t -> System.out.println(t.toString()));
	}

}
