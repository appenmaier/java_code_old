package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import helpers.Movies;
import helpers.Movies.Genre;
import helpers.Movies.Movie;

/**
 * Bedarfsauswertung (Lazy Evaluation)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI03 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies();

    movies.stream().filter(m -> {
      System.out.println(m + ": filter 1");
      return m.genre().equals(Genre.DRAMA);
    }).filter(m -> {
      System.out.println(m + ": filter 2");
      return m.title().length() > 15;
    }).map(m -> {
      System.out.println(m + ": map");
      return m.title();
    }).forEach(System.out::println);

  }

}
