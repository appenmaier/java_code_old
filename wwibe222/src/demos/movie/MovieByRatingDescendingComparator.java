package demos.movie;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie03> {

  @Override
  public int compare(Movie03 movie1, Movie03 movie2) {
    return Double.valueOf(movie2.getRating()).compareTo(movie1.getRating());
  }

}
