package demos;

import java.util.ArrayList;
import java.util.Collections;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Geschachtelte Klassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo43 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = Movies.getMovies();

		Collections.sort(movies, new Movies.MovieByTitleComparator());

		for (Movie m : movies) {
			System.out.println(m);
		}

	}

}
