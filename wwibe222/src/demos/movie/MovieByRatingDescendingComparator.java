package demos.movie;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie03> {

  @Override
  public int compare(Movie03 o1, Movie03 o2) {
    return Double.valueOf(o2.getRating()).compareTo(o1.getRating());
  }

}
