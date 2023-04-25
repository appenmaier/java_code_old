package demos;

import java.util.ArrayList;
import java.util.Collections;
import demos.movie.Movie;
import demos.movie.Movie.Genre;

/**
 * Geschachtelte Klassen
 * 
 * @author Daniel Appenmaier
 *
 */
public class InnerClasses01 {

  public static void main(String[] args) {

    Movie movie05 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    movie05.genres().add(Genre.ACTION);
    Collections.sort(null, new Movie.MovieByRatingDescendingComparator());

  }

}
