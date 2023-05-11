package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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
public class JavaStreamAPI02 {

  private static ArrayList<Movie> movies;

  private static void aggregate() {
    System.out.println("Aggregieren: durchschnittliche Bewertung aller Komoedien");

    /* imperativ */
    // double total = 0;
    // int count = 0;
    // for (Movie m : movies) {
    // if (m.genres().contains(Genre.COMEDY)) {
    // count++;
    // total += m.rating();
    // }
    // }
    // double averageRating = total / count;
    // System.out.println(averageRating);
    // System.out.println();

    /* funktional */
    OptionalDouble optionalAverageRating = movies.stream()
        .filter(m -> m.genres().contains(Genre.COMEDY)).mapToDouble(m -> m.rating()).average();
    optionalAverageRating.ifPresent(System.out::println);
    System.out.println();
  }

  private static void check() {
    System.out.println("Pruefen: gibt es einen Horrorfilm aus dem Jahr 1982");

    /* imperativ */
    // for (Movie m : movies) {
    // if (m.genres().contains(Genre.HORROR) && m.year().equals("1982")) {
    // System.out.println(true);
    // }
    // }
    // System.out.println();

    /* funktional */
    boolean isSuccessful =
        movies.stream().anyMatch(m -> m.genres().contains(Genre.HORROR) && m.year().equals("1982"));
    System.out.println(isSuccessful);
    System.out.println();
  }

  private static List<Movie> collect() {
    System.out.println("Sammeln: alle Horrorfilme mit einer Bewertung von min. 5 als Liste");

    /* imperativ */
    // ArrayList<Movie> horrorFilms = new ArrayList<>();
    // for (Movie m : movies) {
    // if (m.genres().contains(Genre.HORROR) && m.rating() >= 5) {
    // horrorFilms.add(m);
    // }
    // }
    // return horrorFilms;

    return movies.stream().filter(m -> m.genres().contains(Genre.HORROR) && m.rating() >= 5)
        .collect(Collectors.toList());
  }

  private static Map<String, List<Movie>> collect2() {
    System.out.println("Sammeln: alle Horrorfilme zu jedem Jahr");

    /* imperativ */
    // HashMap<String, List<Movie>> horrorFilmsByYear = new HashMap<>();
    // for (Movie m : movies) {
    // if (m.genres().contains(Genre.HORROR)) {
    // if (!horrorFilmsByYear.containsKey(m.year())) {
    // horrorFilmsByYear.put(m.year(), new ArrayList<>());
    // }
    // List<Movie> tmp = horrorFilmsByYear.get(m.year());
    // tmp.add(m);
    // }
    // }
    // return horrorFilmsByYear;

    /* funktional */
    return movies.stream().filter(m -> m.genres().contains(Genre.HORROR))
        .collect(Collectors.groupingBy(m -> m.year()));
  }

  private static void distinct() {
    System.out.println("Unterscheiden: keine Duplikate");

    ArrayList<Movie> tmp = new ArrayList<>();
    tmp.add(movies.get(0));
    tmp.add(movies.get(0));
    tmp.add(movies.get(0));

    /* imperativ */
    // HashSet<Movie> distinctMovies = new HashSet<>(tmp);
    // for (Movie m : distinctMovies) {
    // System.out.println(m);
    // }
    // System.out.println();

    /* funktional */
    tmp.stream().distinct().forEach(System.out::println);
    System.out.println();
  }

  private static void filter() {
    System.out.println("Filtern: alle Filme zwischen 1990 und 2000 ");

    /* imperativ */
    // for (Movie m : movies) {
    // if (m.year().compareTo("1990") >= 0 && m.year().compareTo("2000") < 0) {
    // System.out.println(m);
    // }
    // }
    // System.out.println();

    /* funktional */
    movies.stream().filter(m -> m.year().compareTo("1990") >= 0 && m.year().compareTo("2000") < 0)
        .forEach(System.out::println);
    System.out.println();
  }

  private static void find() {
    System.out.println("Finden: ein Thriller");

    /* imperativ */
    // for (Movie m : movies) {
    // if (m.genres().contains(Genre.THRILLER)) {
    // System.out.println(m);
    // break;
    // }
    // }
    // System.out.println();

    /* funktional */
    Optional<Movie> thriller =
        movies.stream().filter(m -> m.genres().contains(Genre.THRILLER)).findAny();
    thriller.ifPresent(System.out::println);
    System.out.println();
  }

  private static void limit() {
    System.out.println("Begrenzen: Die ersten 5 Filme");

    /* imperativ */
    // for (int i = 0; i < 5; i++) {
    // System.out.println(movies.get(i));
    // }
    // System.out.println();

    /* funktional */
    movies.stream().limit(5).forEach(System.out::println);
    System.out.println();
  }

  public static void main(String[] args) throws FileNotFoundException {

    movies = Movies.getMoviesByVotes(10, 250000);

    /* Ausgabe */
    for (Movie m : movies) {
      System.out.println(m);
    }
    System.out.println();

    /* Intermediaere Operationen */
    /* Filtern (filter) */
    filter();

    /* Abbilden (map, mapToInt, mapToDouble, mapToLong) */
    map();
    mapToDouble();

    /* Sortieren (sorted) */
    sort();

    /* Ueberspringen und Begrenzen (skip, limit) */
    limit();

    /* Unterscheiden (distinct) */
    distinct();

    /* Spaehen */
    peek();

    /* Terminale Operationen */
    /* Finden (findAny, findFirst) */
    find();

    /* Pruefen (anyMatch, allMatch, noneMatch) */
    check();

    /* Aggregieren (count, sum, average, max, min) */
    aggregate();

    /* Sammeln (collect) */
    List<Movie> horrorFilms = collect();
    horrorFilms.forEach(System.out::println);
    System.out.println();

    Map<String, List<Movie>> horrorFilmsByYear = collect2();
    horrorFilmsByYear.forEach((year, movies) -> System.out.println(year + ": " + movies));

  }

  private static void map() {
    System.out.println("Abbilden: Filmtitel (Jahr)");

    /* imperativ */
    // ArrayList<String> titles = new ArrayList<>();
    // for (Movie m : movies) {
    // String title = m.title() + " (" + m.year() + ")";
    // titles.add(title);
    // System.out.println(title);
    // }
    // System.out.println();

    /* funktional */
    movies.stream().map(m -> m.title() + " (" + m.year() + ")").forEach(System.out::println);
    System.out.println();
  }

  private static void mapToDouble() {
    System.out.println("Abbilden: Bewertung");

    /* imperativ */
    // for (Movie m : movies) {
    // System.out.println(m.rating());
    // }
    // System.out.println();

    /* funktional */
    movies.stream().mapToDouble(m -> m.rating()).forEach(System.out::println);
    System.out.println();
  }

  private static List<String> peek() {
    System.out.println("Spaehen");

    List<String> tmp =
        movies.stream().filter(m -> m.rating() > 5).map(m -> m.title() + ": " + m.rating())
            .peek(System.out::println).sorted().collect(Collectors.toList());

    return tmp;
  }

  private static void sort() {
    System.out.println("Sortieren: absteigend nach dem Filmtitel");

    /* imperativ */
    // Collections.sort(movies, (m1, m2) -> m2.title().compareTo(m1.title()));
    // for (Movie m : movies) {
    // System.out.println(m);
    // }
    // System.out.println();

    /* funktional */
    movies.stream().sorted((m1, m2) -> m2.title().compareTo(m1.title()))
        .forEach(System.out::println);
    System.out.println();
  }

}
