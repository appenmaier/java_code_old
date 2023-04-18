package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import demos.movie.Movie05;
import helpers.Movies;

/**
 * Lokale Klassen, Anonyme Klassen, Lambda-Ausdruecke und Methodenreferenzen
 * 
 * @author Daniel Appenmaier
 *
 */
public class InnerClasses03 {

  private static ArrayList<Movie05> movies;

  public static void main(String[] args) throws FileNotFoundException {

    movies = Movies.getMovies(5);
    sortMovies();
    printMovies();

  }

  public static void printMovies() {
    /* klassische for-Schleife */
    for (int i = 0; i < movies.size(); i++) {
      System.out.println(movies.get(i));
    }
    System.out.println();

    /* for-Each-Schleife */
    for (Movie05 movie : movies) {
      System.out.println(movie);
    }
    System.out.println();

    /* forEach-Methode: Lokale Klasse */
    class MoviePrinter implements Consumer<Movie05> {
      @Override
      public void accept(Movie05 movie) {
        System.out.println(movie);
      }
    }
    movies.forEach(new MoviePrinter());
    System.out.println();

    /* forEach-Methode: Anonyme Klasse */
    movies.forEach(new Consumer<Movie05>() {
      @Override
      public void accept(Movie05 movie) {
        System.out.println(movie);
      }
    });
    System.out.println();

    /* forEach-Methode: Lambda-Ausdruck */
    movies.forEach(movie -> System.out.println(movie));
    System.out.println();

    /* forEach-Methode: Methodenreferenz */
    movies.forEach(System.out::println);
  }

  public static void sortMovies() {
    /* Lokale Klasse */
    class MovieByTitleDescendingComparator implements Comparator<Movie05> {
      @Override
      public int compare(Movie05 movie1, Movie05 movie2) {
        return movie2.title().compareTo(movie1.title());
      }
    }
    Collections.sort(movies, new MovieByTitleDescendingComparator());

    /* Anonyme Klasse */
    Collections.sort(movies, new Comparator<Movie05>() {
      @Override
      public int compare(Movie05 movie1, Movie05 movie2) {
        return movie1.year().compareTo(movie2.year());
      }
    });

    /* Lamba-Ausdruck */
    Collections.sort(movies, (movie1, movie2) -> movie2.year().compareTo(movie1.year()));
  }

}
