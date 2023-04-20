package demos.movie;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie> {

  @Override
  public int compare(Movie o1, Movie o2) {
    return Double.valueOf(o2.getRating()).compareTo(o1.getRating());
  }

}
