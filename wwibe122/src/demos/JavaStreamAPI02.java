package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import demos.movie.Movie;
import demos.movie.Movie.MovieGenre;
import helpers.Movies;

/**
 * Intermediaere und Terminale Operationen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI02 {

  private static ArrayList<Movie> movies;

  public static OptionalDouble getAverageRatingOfAllMovies() {
    System.out.println("Durchschnittsbewertung aller Filme");

    OptionalDouble averageRatingOfAllMovies =
        movies.stream().mapToDouble(m -> m.rating()).average();
    return averageRatingOfAllMovies;
  }

  public static Optional<Movie> getLongestComedyMovie() {
    System.out.println("Die laengste Komoedie");

    Optional<Movie> longestComedyMovie =
        movies.stream().filter(m -> m.genres().contains(MovieGenre.COMEDY))
            .max((m1, m2) -> Integer.valueOf(m1.runtime()).compareTo(m2.runtime()));
    return longestComedyMovie;
  }

  public static void main(String[] args) throws FileNotFoundException {

    movies = Movies.getMovies(50, 100000);
    movies.forEach(System.out::println);
    System.out.println();

    /* filter, map, forEach */
    printAllThrillersWithRatingBE7();

    /* mapToDouble/mapToInt/mapToLong, average/sum */
    OptionalDouble averageRatingOfAllMovies = getAverageRatingOfAllMovies();
    averageRatingOfAllMovies.ifPresent(System.out::println);
    System.out.println();

    /* filter, sorted, limit/skip, forEach */
    printTop5HorrorMovies();

    /* filter, max/min/count */
    Optional<Movie> longestComedyMovie = getLongestComedyMovie();
    longestComedyMovie.ifPresent(System.out::println);
    System.out.println();

  }

  public static void printAllThrillersWithRatingBE7() {
    System.out.println("Alle Thriller mit einer Bewertung von min. 7 in der Form 'Titel (Jahr)'");

    movies.stream().filter(m -> m.genres().contains(MovieGenre.THRILLER))
        .filter(m -> m.rating() >= 7).map(m -> m.title() + " (" + m.year() + ")")
        .forEach(System.out::println);
    System.out.println();
  }

  public static void printTop5HorrorMovies() {
    System.out.println("Die besten 5 Horrorfilme");

    movies.stream().filter(m -> m.genres().contains(MovieGenre.HORROR))
        .sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating())).limit(5)
        .forEach(System.out::println);
    System.out.println();
  }

}
