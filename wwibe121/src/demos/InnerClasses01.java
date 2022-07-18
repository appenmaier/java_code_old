package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Geschachtelte Klassen (Nested Classes)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InnerClasses01 {

	public static void main(String[] args) {

		try {
			ArrayList<Movie> movies = Movies.getMovies();

			for (Movie m : movies) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
