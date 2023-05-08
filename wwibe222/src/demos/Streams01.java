package demos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import demos.movie.Movie;
import demos.movie.Movie.Genre;
import helpers.Movies;

/**
 * Die Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Streams01 {

  public static void main(String[] args) throws FileNotFoundException {

    List<Movie> movies = Movies.getMovies(25);

    /* Imperative Programmierung */
    ArrayList<String> titles = new ArrayList<>();

    for (Movie m : movies) {
      if (m.year().compareTo("1990") > 0 && m.genres().contains(Genre.DRAMA)) {
        String title = m.title();
        titles.add(title);
      }
    }

    Collections.sort(titles, (t1, t2) -> t2.compareTo(t1));

    for (String t : titles) {
      System.out.println(t);
    }
    System.out.println();

    /* Funktionale Programmierung */
    movies.stream().filter(m -> m.year().compareTo("1990") > 0)
        .filter(m -> m.genres().contains(Genre.DRAMA)).map(m -> m.title())
        .sorted((t1, t2) -> t2.compareTo(t1)).forEach(System.out::println);

  }

}
