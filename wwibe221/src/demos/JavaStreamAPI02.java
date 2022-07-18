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
public class JavaStreamAPI02 {

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
		System.out.println("Filtern (alle Filme der 90er):");

//		for (Movie m : movies) {
//			if (m.publishingYear().compareTo("1990") >= 0 && m.publishingYear().compareTo("2000") < 0) {
//				System.out.println(m);
//			}
//		}

		movies.stream()
				.filter(m -> m.publishingYear().compareTo("1990") >= 0)
				.filter(m -> m.publishingYear().compareTo("2000") < 0)
				.forEach(System.out::println);

		System.out.println();

	}

	private static void map() {
		System.out.println("Abbilden (FILMTITEL (Erscheinungsjahr)):");

//		for (Movie m : movies) {
//			String tmp = m.title().toUpperCase() + " (" + m.publishingYear() + ")";
//			System.out.println(tmp);
//		}

		movies.stream()
				.map(m -> m.title().toUpperCase() + " (" + m.publishingYear() + ")")
				.forEach(System.out::println);

		System.out.println();

	}

	private static void sort() {
		System.out.println("Sortieren (alle Filme aufsteigend nach Filmtitel):");

//		Collections.sort(movies, new Comparator<Movie>() {
//			@Override
//			public int compare(Movie m1, Movie m2) {
//				return m1.title().compareTo(m2.title());
//			}
//		});
//
//		for (Movie m : movies) {
//			System.out.println(m);
//		}

		movies.stream().sorted((m1, m2) -> m1.title().compareTo(m2.title())).forEach(System.out::println);

		System.out.println();

	}

}
