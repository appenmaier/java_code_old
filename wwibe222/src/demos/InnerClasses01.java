package demos;

import java.util.ArrayList;
import java.util.Collections;
import demos.movie.Movie05;
import demos.movie.Movie05.Genre02;

/**
 * Geschachtelte Klassen
 * 
 * @author Daniel Appenmaier
 *
 */
public class InnerClasses01 {

  public static void main(String[] args) {

    Movie05 movie05 = new Movie05("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    movie05.genres().add(Genre02.ACTION);
    Collections.sort(null, new Movie05.MovieByRatingDescendingComparator());

  }

}
