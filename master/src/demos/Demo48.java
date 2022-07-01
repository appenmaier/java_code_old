package demos;

import java.util.ArrayList;

import helpers.Movies;
import helpers.Movies.Genre;
import helpers.Movies.Movie;

/**
 * Bedarfsauswertung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo48 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = Movies.getMovies();

		movies.stream().filter(movie -> {
			System.out.println(movie + ": filter 1");
			return movie.genre().equals(Genre.DRAMA);
		}).filter(movie -> {
			System.out.println(movie + ": filter 2");
			return movie.title().length() > 15;
		}).map(movie -> {
			System.out.println(movie + ": map");
			return movie.title();
		}).forEach(title -> {
			System.out.println(title + ": forEach");
		});

	}

}
