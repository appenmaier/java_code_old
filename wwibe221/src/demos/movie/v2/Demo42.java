package demos.movie.v2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import demos.movie.v2.Movie.MovieByRatingDescendingComparator;
import helpers.Movies;

/**
 * Geschachtelte Klassen (Nested Classes)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo42 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie> movies = Movies.getMovies();

		Collections.sort(movies, new MovieByRatingDescendingComparator());

		for (Movie m : movies) {
			System.out.println(m);
		}

	}

}
