package demos;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import helpers.Movies;
import helpers.Movies.Movie;

/**
 * Unendliche Stroeme
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo47 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = Movies.getMovies();

		Stream.iterate(0, i -> ++i).limit(movies.size()).forEach(i -> System.out.println(movies.get(i)));

		System.out.println();

		Stream.iterate(0, i -> i < movies.size(), i -> ++i).forEach(i -> System.out.println(movies.get(i)));

		System.out.println();

		Stream.generate(() -> new Random().nextInt(movies.size())).limit(50)
				.forEach(i -> System.out.println(movies.get(i)));

	}

}
