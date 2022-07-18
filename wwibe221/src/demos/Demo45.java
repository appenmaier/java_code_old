package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import demos.movie.v2.Movie;
import demos.movie.v2.Movie.Genre;
import helpers.Movies;

/**
 * Die Java Stream API
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo45 {

	public static void main(String[] args) throws FileNotFoundException {

		List<Movie> movies = Movies.getMovies();

		// Imperative Lösung
		Collections.sort(movies, (m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()));

		ArrayList<String> dramasFrom1990OrLater = new ArrayList<>();
		for (Movie m : movies) {
			if (m.genre().equals(Genre.DRAMA) && m.publishingYear().compareTo("1990") >= 0) {
				String dramaFrom1990OrLater = m.title().toUpperCase() + " (" + m.rating() + ")";
				dramasFrom1990OrLater.add(dramaFrom1990OrLater);
			}
		}

		for (String d : dramasFrom1990OrLater) {
			System.out.println(d);
		}

		System.out.println();

		// Funktionale Lösung
		movies.stream()
				.filter(m -> m.genre().equals(Genre.DRAMA) && m.publishingYear().compareTo("1990") >= 0)
				.sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()))
				.map(m -> m.title().toUpperCase() + " (" + m.rating() + ")")
				.forEach(System.out::println);

	}

}
