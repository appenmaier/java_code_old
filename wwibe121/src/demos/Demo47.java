package demos;

import java.io.FileNotFoundException;
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
public class Demo47 {

	private static List<Movie> movies;

	public static void main(String[] args) throws FileNotFoundException {

		movies = Movies.getMovies();

		/*
		 * Intermediaere Operationen
		 */
		// Filtern (filter)
		filter();

		// Abbilden (flatMap, map, mapToInt, mapToDouble)
		map();

		// Sortieren (sorted)
		sort();

	}

	private static void filter() {
		System.out.println("Filtern (alle Filme mit einer Bewertung von min. 7):");

//		for (Movie m : movies) {
//			if (m.rating() >= 7) {
//				System.out.println(m);
//			}
//		}

		movies.stream().filter(m -> m.rating() >= 7).forEach(System.out::println);

		System.out.println();
	}

	private static void map() {
		System.out.println("Abbilden (filmtitel (Erscheinungsjahr)):");

//		for (Movie m : movies) {
//			String tmp = m.title().toLowerCase() + " (" + m.publishingYear() + ")";
//			System.out.println(tmp);
//		}

		movies.stream()
				.map(m -> m.title().toLowerCase() + " (" + m.publishingYear() + ")")
				.forEach(System.out::println);

		System.out.println();

	}

	private static void sort() {
		System.out.println("Sortieren (aufsteigend nach dem Genre)");

//		Collections.sort(movies, new Comparator<Movie>() {
//			@Override
//			public int compare(Movie o1, Movie o2) {
//				return o1.genre().compareTo(o2.genre());
//			}
//		});
//		for (Movie m : movies) {
//			System.out.println(m);
//		}

		movies.stream().sorted((m1, m2) -> m1.genre().compareTo(m2.genre())).forEach(System.out::println);

		System.out.println();

	}

}
