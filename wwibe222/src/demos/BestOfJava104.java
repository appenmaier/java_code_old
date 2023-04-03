package demos;

import java.util.ArrayList;

import demos.movie.Genre02;
import demos.movie.Movie03;

/**
 * Aufzählungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava104 {

	public static void main(String[] args) {

		Movie03 movie1 = new Movie03("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
		Movie03 movie2 = new Movie03("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

		movie1.getGenres().add(Genre02.ACTION);
		movie1.getGenres().add(Genre02.CRIME);
		movie1.getGenres().add(Genre02.THRILLER);
		movie2.getGenres().add(Genre02.ACTION);
		movie2.getGenres().add(Genre02.CRIME);
		movie2.getGenres().add(Genre02.THRILLER);

		System.out.println(movie1.equals(movie2));

		for (Genre02 g : Genre02.values()) {
			System.out.println(g.getName());
		}

	}

}
