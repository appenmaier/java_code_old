package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import demos.movie.Movie;
import demos.movie.MovieByRatingDescendingComparator;
import helpers.Movies;

/**
 * Komparatoren
 * 
 * @author Daniel Appenmaier
 *
 */
public class Comparators01 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies(10);

    Collections.sort(movies);
    Collections.sort(movies, new MovieByRatingDescendingComparator());

    for (Movie m : movies) {
      System.out.println(m);
    }

  }

}
