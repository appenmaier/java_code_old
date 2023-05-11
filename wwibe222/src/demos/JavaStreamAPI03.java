package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import demos.movie.Movie;
import helpers.Movies;

/**
 * Unendliche Stroeme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI03 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMoviesByVotes(50, 250000);

    Stream.generate(() -> new Random().nextInt(movies.size())).limit(10)
        .forEach(r -> System.out.println(movies.get(r)));

  }

}
