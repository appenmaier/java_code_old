package demos;

import java.util.ArrayList;
import demos.movie.Movie03;
import demos.movie.Movie04;

/**
 * Datenklassen (Records)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Records01 {

  public static void main(String[] args) {

    Movie03 movie = new Movie03("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie03 copyOfMovie = new Movie03("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie04 movie2 = new Movie04("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie04 copyOfMovie2 = new Movie04("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

    System.out.println(movie);
    System.out.println(movie2);

    System.out.println(movie.equals(copyOfMovie));
    System.out.println(movie2.equals(copyOfMovie2));

    System.out.println(movie.hashCode());
    System.out.println(copyOfMovie.hashCode());

    System.out.println(movie2.hashCode());
    System.out.println(copyOfMovie2.hashCode());

  }

}
