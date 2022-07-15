package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

import demos.movie.v2.Movie;
import helpers.Movies;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdrücke, Methodenreferenzen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo44 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie> movies = Movies.getMovies();

		/*
		 * Top-Level-Klasse
		 */
		Collections.sort(movies, new Movie.MovieByRatingDescendingComparator());

		/*
		 * Lokale Klassen
		 */
		class MovieByTitleAscendingComparator implements Comparator<Movie> {
			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.title().compareTo(o2.title());
			}
		}
		Collections.sort(movies, new MovieByTitleAscendingComparator());

		/*
		 * Anonyme Klasse
		 */
		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				return o2.title().compareTo(o1.title());
			}
		});

		/*
		 * Lamba-Ausdruck
		 */
		Collections.sort(movies, (o1, o2) -> o2.title().compareTo(o1.title()));

		/*
		 * Methodenreferenz
		 */
		movies.forEach(new Consumer<Movie>() {
			@Override
			public void accept(Movie t) {
				System.out.println(t);
			}
		});
		movies.forEach(t -> System.out.println(t));
		movies.forEach(System.out::println);

		/*
		 * Ausgabe
		 */
		for (Movie m : movies) {
			System.out.println(m);
		}

	}

}
