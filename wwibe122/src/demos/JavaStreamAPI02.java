package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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

  public static List<Movie> getAllActionFilmsAsList() {
    System.out.println("Alle Actionfilme als Liste");

    List<Movie> allActionFilms = movies.stream().filter(m -> m.genres().contains(MovieGenre.ACTION))
        .collect(Collectors.toList());
    return allActionFilms;
  }

  public static Map<String, List<Movie>> getAllMoviesByYear() {
    System.out.println("Alle Filme gruppiert nach Jahr");

    Map<String, List<Movie>> allMoviesByYear =
        movies.stream().collect(Collectors.groupingBy(m -> m.year()));
    return allMoviesByYear;
  }

  public static List<String> getAllTitlesWithRuntimeInMinutesLE90AsList() {
    System.out.println("Alle Filmtitel von Filmen mit einer Laufzeit von max. 90 Minuten");

    return movies.stream().filter(m -> m.runtime() <= 90).peek(System.out::println)
        .map(m -> m.title()).collect(Collectors.toList());
  }

  public static OptionalDouble getAverageRatingOfAllMovies() {
    System.out.println("Durchschnittsbewertung aller Filme");

    OptionalDouble averageRatingOfAllMovies =
        movies.stream().mapToDouble(m -> m.rating()).average();
    return averageRatingOfAllMovies;
  }

  public static Optional<Movie> getDrama() {
    System.out.println("Ein Drama");

    Optional<Movie> drama =
        movies.stream().filter(m -> m.genres().contains(MovieGenre.DRAMA)).findFirst();
    return drama;
  }

  public static Optional<Movie> getLongestComedyMovie() {
    System.out.println("Die laengste Komoedie");

    Optional<Movie> longestComedyMovie =
        movies.stream().filter(m -> m.genres().contains(MovieGenre.COMEDY))
            .max((m1, m2) -> Integer.valueOf(m1.runtime()).compareTo(m2.runtime()));
    return longestComedyMovie;
  }

  public static boolean isHorrorMovieFrom1982Available() {
    System.out.println("Gibt es einen Horrorfilm aus 1982?");

    boolean isHorrorMovieFrom1982Available = movies.stream()
        .anyMatch(m -> m.genres().contains(MovieGenre.HORROR) && m.year().equals("1982"));
    return isHorrorMovieFrom1982Available;
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

    /* filter, findFirst/findAny */
    Optional<Movie> drama = getDrama();
    drama.ifPresent(System.out::println);
    System.out.println();

    /* anyMatch/allMatch/noneMatch */
    boolean isHorrorMovieFrom1982Available = isHorrorMovieFrom1982Available();
    System.out.println(isHorrorMovieFrom1982Available);
    System.out.println();

    /* filter, collect */
    List<Movie> allActionFilms = getAllActionFilmsAsList();
    allActionFilms.forEach(System.out::println);
    System.out.println();

    /* map, distinct, sorted, forEach */
    printAllDistinctYearsAscending();

    /* collect */
    Map<String, List<Movie>> allMoviesByYear = getAllMoviesByYear();
    allMoviesByYear.forEach((y, movies) -> System.out.println(y + ": " + movies));
    System.out.println();

    /* filter, map, collect, peek */
    getAllTitlesWithRuntimeInMinutesLE90AsList();

  }

  public static void printAllDistinctYearsAscending() {
    System.out.println();

    movies.stream().map(m -> m.year()).distinct().sorted().forEach(System.out::println);
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
