package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import helpers.Movies;
import helpers.Movies.Genre;
import helpers.Movies.Movie;

/**
 * Die Java Stream API
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo46 {

	public static void main(String[] args) throws FileNotFoundException {

		List<Movie> movies = Movies.getMovies();

		List<String> dramasFrom90s = new ArrayList<>();

		// Imperative Lösung
		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return Double.valueOf(m2.rating()).compareTo(m1.rating());
			}
		});

		for (Movie m : movies) {
			if (m.genre().equals(Genre.DRAMA) && m.publishingYear().compareTo("1990") >= 0
					&& m.publishingYear().compareTo("2000") < 0) {
				String dramaFrom90s = m.title().toUpperCase() + " (" + m.rating() + ")";
				dramasFrom90s.add(dramaFrom90s);
			}
		}

		for (String d : dramasFrom90s) {
			System.out.println(d);
		}

		System.out.println();

		// Funktionale Lösung
		movies.stream()
				.sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()))
				.filter(m -> m.genre().equals(Genre.DRAMA))
				.filter(m -> m.publishingYear().compareTo("1990") >= 0)
				.filter(m -> m.publishingYear().compareTo("2000") < 0)
				.map(m -> m.title().toUpperCase() + " (" + m.rating() + ")")
				.forEach(System.out::println);

	}

}
