package demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdruecke, Methodenreferenzen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo45 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = Movies.getMovies();

		/*
		 * Top-Level-Klassen
		 */
		Collections.sort(movies, new Movies.MovieByTitleComparator());

		/*
		 * Lokale Klassen
		 */
		class MovieByTitleComparator implements Comparator<Movie> {
			public int compare(Movie m1, Movie m2) {
				return m1.title().compareTo(m2.title());
			}
		}

		Collections.sort(movies, new MovieByTitleComparator());

		/*
		 * Anonyme Klassen
		 */
		Collections.sort(movies, new Comparator<Movie>() {
			public int compare(Movie m1, Movie m2) {
				return m1.title().compareTo(m2.title());
			}
		});

		/*
		 * Lambda-Ausdruecke
		 */
		Collections.sort(movies, (m1, m2) -> m1.title().compareTo(m2.title()));

		/*
		 * Methodenreferenzen
		 */
		Collections.sort(movies, (m1, m2) -> Demo45.compareMoviesByTitle(m1, m2));
		Collections.sort(movies, Demo45::compareMoviesByTitle);

	}

	public static int compareMoviesByTitle(Movie m1, Movie m2) {
		return m1.title().compareTo(m2.title());
	}

}
