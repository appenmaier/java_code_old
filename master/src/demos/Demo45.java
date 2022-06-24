package demos;

import java.util.List;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Intermediaere und Terminale Operationen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo45 {

	public static void main(String[] args) {

		List<Movie> movies = Movies.getMovies();

		/*
		 * Filtern (distinct, filter)
		 */
		System.out.println();
		for (Movie movie : movies) {
			if (movie.publishingYear().compareTo("1990") >= 0 && movie.publishingYear().compareTo("2000") < 0) {
				System.out.println(movie);
			}
		}

		System.out.println();
		movies.stream().filter(
				movie -> movie.publishingYear().compareTo("1990") >= 0 && movie.publishingYear().compareTo("2000") < 0)
				.forEach(System.out::println);

		/*
		 * Abbilden (flatMap, map, mapMulti)
		 */
		System.out.println();
		for (Movie movie : movies) {
			String title = movie.title();
			System.out.println(title.toUpperCase());
		}

		System.out.println();
		movies.stream().map(movie -> movie.title().toUpperCase()).forEach(System.out::println);

		/*
		 * Suchen (allMatch, anyMatch, nonMatch, findAny, findFirst)
		 */
		System.out.println();
		for (Movie movie : movies) {
			if (movie.publishingYear().equals("1990")) {
				System.out.println(true);
			}
		}

		System.out.println();
		System.out.println(movies.stream().anyMatch(movie -> movie.publishingYear().equals("1990")));

		/*
		 * Aggregieren (average, count, max, min, reduce, sum)
		 */
		System.out.println();
		double total = 0;
		for (Movie movie : movies) {
			total += movie.rating();
		}
		System.out.println(total / movies.size());

		System.out.println();
		System.out.println(movies.stream().mapToDouble(movie -> movie.rating()).average().getAsDouble());

		/*
		 * Sammeln
		 */
		// Collectors

		// Sortieren

	}

}
