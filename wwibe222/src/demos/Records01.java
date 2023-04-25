package demos;

import java.util.ArrayList;
import demos.movie.Movie;

/**
 * Datenklassen (Records)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Records01 {

  public static void main(String[] args) {

    Movie movie = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie copyOfMovie = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

    System.out.println(movie);
    System.out.println(movie.equals(copyOfMovie));
    System.out.println(movie.hashCode());
    System.out.println(copyOfMovie.hashCode());

  }

}
