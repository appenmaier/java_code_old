package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalDouble;
import demos.movie.Movie;
import demos.movie.Movie.Genre;
import helpers.Movies;

/**
 * Intermediaere und Terminale Operationen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Streams02 {

  private static ArrayList<Movie> movies;

  private static void aggregate() {
    System.out.println("Aggregieren: durchschnittliche Bewertung aller Komoedien");

    /* imperativ */
    double total = 0;
    int count = 0;
    for (Movie m : movies) {
      if (m.genres().contains(Genre.COMEDY)) {
        count++;
        total += m.rating();
      }
    }
    double averageRating = total / count;
    System.out.println(averageRating);
    System.out.println();

    /* funktional */
    OptionalDouble optionalAverageRating = movies.stream()
        .filter(m -> m.genres().contains(Genre.COMEDY)).mapToDouble(m -> m.rating()).average();
    optionalAverageRating.ifPresent(System.out::println);
    System.out.println();
  }

  private static void check() {
    System.out.println("Pruefen: gibt es einen Horrorfilm aus dem Jahr 1982");

    /* imperativ */
    for (Movie m : movies) {
      if (m.genres().contains(Genre.HORROR) && m.year().equals("1982")) {
        System.out.println(true);
      }
    }
    System.out.println();

    /* funktional */
    boolean isSuccessful =
        movies.stream().anyMatch(m -> m.genres().contains(Genre.HORROR) && m.year().equals("1982"));
    System.out.println(isSuccessful);
    System.out.println();
  }

  private static void filter() {
    System.out.println("Filtern: alle Filme zwischen 1990 und 2000 ");

    /* imperativ */
    for (Movie m : movies) {
      if (m.year().compareTo("1990") >= 0 && m.year().compareTo("2000") < 0) {
        System.out.println(m);
      }
    }
    System.out.println();

    /* funktional */
    movies.stream().filter(m -> m.year().compareTo("1990") >= 0 && m.year().compareTo("2000") < 0)
        .forEach(System.out::println);
    System.out.println();
  }

  private static void find() {
    System.out.println("Finden: ein Thriller");

    /* imperativ */
    for (Movie m : movies) {
      if (m.genres().contains(Genre.THRILLER)) {
        System.out.println(m);
        break;
      }
    }
    System.out.println();

    /* funktional */
    Optional<Movie> thriller =
        movies.stream().filter(m -> m.genres().contains(Genre.THRILLER)).findAny();
    thriller.ifPresent(System.out::println);
    System.out.println();
  }

  public static void main(String[] args) throws FileNotFoundException {

    movies = Movies.getMovies(25);

    /* Intermediaere Operationen */
    /* Filtern (filter) */
    filter();

    /* Abbilden (map, mapToInt, mapToDouble, mapToLong) */
    map();
    map2();

    /* Sortieren (sorted) */
    sort();

    /* Ueberspringen, Begrenzen und Unterscheiden (skip, limit, distinct) */
    skipAndLimitAndDistinct();

    /* Terminale Operationen */
    /* Finden (findAny, findFirst) */
    find();

    /* Pruefen (anyMatch, allMatch) */
    check();

    /* Aggregieren (count, sum, average, max, min) */
    aggregate();

  }

  private static void map() {
    System.out.println("Abbilden: Filmtitel (Jahr)");

    /* imperativ */
    ArrayList<String> titles = new ArrayList<>();
    for (Movie m : movies) {
      String title = m.title() + " (" + m.year() + ")";
      titles.add(title);
      System.out.println(title);
    }
    System.out.println();

    /* funktional */
    movies.stream().map(m -> m.title() + " (" + m.year() + ")").forEach(System.out::println);
    System.out.println();
  }

  private static void map2() {
    System.out.println("Abbilden: Bewertung");

    /* imperativ */
    for (Movie m : movies) {
      System.out.println(m.rating());
    }
    System.out.println();

    /* funktional */
    movies.stream().mapToDouble(m -> m.rating()).forEach(System.out::println);
    System.out.println();
  }

  private static void skipAndLimitAndDistinct() {
    System.out.println("Ueberspringen, Begrenzen und Unterscheiden: Filme 6-10");

    movies.add(new Movie("The Matrix", new ArrayList<>(), "1999", 120, 8.7, 50000));
    movies.add(new Movie("The Matrix", new ArrayList<>(), "1999", 120, 8.7, 50000));

    for (Movie m : movies) {
      System.out.println(m);
    }
    System.out.println();

    /* imperativ */
    @SuppressWarnings("unused")
    HashSet<Movie> distinctMovies = new HashSet<>(movies);
    for (int i = 5; i < 10; i++) {
      System.out.println(movies.get(i));
    }
    System.out.println();

    /* funktional */
    movies.stream().distinct().skip(5).limit(5).forEach(System.out::println);
    System.out.println();
  }

  private static void sort() {
    System.out.println("Sortieren: absteigend nach dem Filmtitel");

    /* imperativ */
    Collections.sort(movies, (m1, m2) -> m2.title().compareTo(m1.title()));
    for (Movie m : movies) {
      System.out.println(m);
    }
    System.out.println();

    /* funktional */
    movies.stream().sorted((m1, m2) -> m2.title().compareTo(m1.title()))
        .forEach(System.out::println);
    System.out.println();
  }

}
