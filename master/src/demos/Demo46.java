package demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import helpers.Movies;
import helpers.Movies.Genre;
import helpers.Movies.Movie;

/**
 * Stroeme
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo46 {

	public static void main(String[] args) {

		List<Movie> movies = Movies.getMovies();

		// Imperative Programmierung
		ArrayList<String> titles = new ArrayList<>();
		for (Movie movie : movies) {
			if (movie.publishingYear().compareTo("1990") >= 0 && movie.genre().equals(Genre.DRAMA)) {
				titles.add(movie.title().toUpperCase());
			}
		}
		Collections.sort(titles);
		for (String title : titles) {
			System.out.println(title);
		}

		System.out.println();

		// Funktionale Programmierung
		movies.stream().filter(movie -> movie.genre().equals(Genre.DRAMA))
				.filter(movie -> movie.publishingYear().compareTo("1990") >= 0)
				.map(movie -> movie.title().toUpperCase()).sorted((title1, title2) -> title1.compareTo(title2))
				.forEach(System.out::println);

	}

}
