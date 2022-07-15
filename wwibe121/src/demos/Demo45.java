package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausrücke, Methodenreferenzen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo45 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie> movies = Movies.getMovies();

		/*
		 * Top-Level-Klasse
		 */
		Collections.sort(movies, new Movies.MovieByTitleAscendingComparator());

		/*
		 * Lokale Klasse
		 */
		class MovieByRatingDescendingComparator implements Comparator<Movie> {
			@Override
			public int compare(Movie o1, Movie o2) {
				return Double.valueOf(o2.rating()).compareTo(o1.rating());
			}
		}
		Collections.sort(movies, new MovieByRatingDescendingComparator());

		/*
		 * Anonyme Klassen
		 */
		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				return Double.valueOf(o1.rating()).compareTo(o2.rating());
			}
		});

		/*
		 * Lambda-Ausdruck
		 */
		Collections.sort(movies, (o1, o2) -> o2.title().compareTo(o1.title()));

		/*
		 * Ausgabe
		 */
//		for (int i = 0; i < movies.size(); i++) {
//			System.out.println(movies.get(i));
//		}

//		for (Movie m : movies) {
//			System.out.println(m);
//		}

//		movies.forEach(new Consumer<Movie>() {
//			@Override
//			public void accept(Movie movie) {
//				System.out.println(movie);
//			}
//		});

//		movies.forEach(movie -> System.out.println(movie));

		movies.forEach(System.out::println);

	}

}
