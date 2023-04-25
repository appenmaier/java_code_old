package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import demos.movie.Movie;
import helpers.Movies;

/**
 * Lesen von Dateien
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava105 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies(10);

    for (Movie m : movies) {
      System.out.println(m);
    }

  }

}
