package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import model.Movie;
import model.Movie.MovieByRatingDescendingComparator;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdruecke und Methodenreferenzen
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D430_InnerClasses {

  public static void main(String[] args) {

    ArrayList<Movie> movies = new ArrayList<>();
    /*
     * version 1.0: movies.add(new Movie("John Wick 4", MovieGenre.ACTION, "2023", 8.4));
     * movies.add(new Movie("Der Pate", MovieGenre.ACTION, "1972", 9.2)); movies.add(new
     * Movie("Disaster Movie", MovieGenre.COMEDY, "2008", 2.1));
     */

    /* Aussere Klasse */
    Collections.sort(movies, new MovieByRatingDescendingComparator());

    /* Lokale Klasse */
    class MovieByRatingAscendingComparator implements Comparator<Movie> {
      @Override
      public int compare(Movie o1, Movie o2) {
        return Double.valueOf(o1.rating()).compareTo(o2.rating());
      }
    }
    Collections.sort(movies, new MovieByRatingAscendingComparator());

    /* Anonyme Klasse */
    Collections.sort(movies, new Comparator<Movie>() {
      @Override
      public int compare(Movie o1, Movie o2) {
        return o2.title().compareTo(o1.title());
      }
    });

    /* Lambda-Ausdruck */
    Collections.sort(movies, (o1, o2) -> {
      return o1.year().compareTo(o2.year());
    });
    Collections.sort(movies, (o1, o2) -> o1.year().compareTo(o2.year()));

    /* Ausgabe */
    for (int i = 0; i < movies.size(); i++) {
      Movie m = movies.get(i);
      System.out.println(m);
    }

    for (Movie m : movies) {
      System.out.println(m);
    }

    /* Lokale Klasse */
    class PrintMovieConsumer implements Consumer<Movie> {
      @Override
      public void accept(Movie m) {
        System.out.println(m);
      }
    }
    movies.forEach(new PrintMovieConsumer());

    /* Anonyme Klasse */
    movies.forEach(new Consumer<Movie>() {
      @Override
      public void accept(Movie m) {
        System.out.println(m);
      }
    });

    /* Lambda-Ausdruck */
    movies.forEach(m -> System.out.println(m));

    /* Methodenreferenz */
    movies.forEach(System.out::println);

  }

}
