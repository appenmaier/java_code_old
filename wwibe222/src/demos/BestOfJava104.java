package demos;

import java.util.ArrayList;
import demos.movie.Movie;
import demos.movie.Movie.Genre;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava104 {

  public static void main(String[] args) {

    Movie movie1 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie movie2 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

    movie1.genres().add(Genre.ACTION);
    movie1.genres().add(Genre.CRIME);
    movie1.genres().add(Genre.THRILLER);
    movie2.genres().add(Genre.ACTION);
    movie2.genres().add(Genre.CRIME);
    movie2.genres().add(Genre.THRILLER);

    System.out.println(movie1.equals(movie2));

    for (Genre g : Genre.values()) {
      System.out.println(g.getName());
    }

  }

}
