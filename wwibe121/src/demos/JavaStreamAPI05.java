package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * (Un)endliche Stroeme
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI05 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie> movies = Movies.getMovies();

		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
		System.out.println();

		Stream.iterate(0, i -> i < movies.size(), i -> ++i).forEach(i -> System.out.println(movies.get(i)));
		System.out.println();
		
		Stream.generate(() -> movies.get(new Random().nextInt(movies.size()))).limit(10).forEach(System.out::println);

	}

}
