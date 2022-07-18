package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import helpers.Movies;
import helpers.Movies.Movie;
import helpers.Movies.Movie.MovieByRatingDescendingComparator;

/**
 * Geschachtelte Klassen (Nested Classes)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InnerClasses01 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie> movies = Movies.getMovies();

		Collections.sort(movies, new MovieByRatingDescendingComparator());

		for (Movie m : movies) {
			System.out.println(m);
		}

	}

}
