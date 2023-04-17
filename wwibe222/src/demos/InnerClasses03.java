package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import demos.movie.Movie05;
import helpers.Movies;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdruecke und Methodenreferenzen
 * 
 * @author Daniel Appenmaier
 *
 */
public class InnerClasses03 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie05> movies = Movies.getMovies();

    /* Geschachtelte Klassen */
    Collections.sort(movies, new Movie05.MovieByRatingDescendingComparator());

    /* Lokale Klassen */
    class MovieByTitleDescendingComparator implements Comparator<Movie05> {
      @Override
      public int compare(Movie05 o1, Movie05 o2) {
        return o2.title().compareTo(o1.title());
      }
    }

    Collections.sort(movies, new MovieByTitleDescendingComparator());

    /* Anonyme Klassen */
    Collections.sort(movies, new Comparator<Movie05>() {
      @Override
      public int compare(Movie05 o1, Movie05 o2) {
        return o1.year().compareTo(o2.year());
      }
    });

    /* Lamba-Ausdruecke */
    Collections.sort(movies, (o1, o2) -> o2.year().compareTo(o1.year()));

    // for (Movie05 movie : movies) {
    // System.out.println(movie);
    // }

    // class MoviePrinter implements Consumer<Movie05> {
    // @Override
    // public void accept(Movie05 movie) {
    // System.out.println(movie);
    // }
    // }

    // movies.forEach(new MoviePrinter());

    // movies.forEach(new Consumer<Movie05>() {
    // @Override
    // public void accept(Movie05 movie) {
    // System.out.println(movie);
    // }
    // });

    // movies.forEach(movie -> System.out.println(movie));

    /* Methodenreferenzen */
    movies.forEach(System.out::println);

  }

}
