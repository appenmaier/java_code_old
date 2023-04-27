package demos.movie;

import java.util.Comparator;
import demos.movie.Movie.MovieGenre;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
@SuppressWarnings("unused")
public record Movie(String title, MovieGenre genre, String year, double rating)
    implements Comparable<Movie> {

  @Override
  public int compareTo(Movie other) {
    return title.compareTo(other.title);
  }

  public static class MovieByRatingDescendingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
      return Double.valueOf(o2.rating()).compareTo(o1.rating());
    }
  }

  public static enum MovieGenre {
    ACTION, HORROR, THRILLER, COMEDY, DRAMA;
  }

}
