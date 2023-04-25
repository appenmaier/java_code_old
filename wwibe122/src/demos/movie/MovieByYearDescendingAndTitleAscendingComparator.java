package demos.movie;

import java.util.Comparator;

public class MovieByYearDescendingAndTitleAscendingComparator implements Comparator<Movie> {

  @Override
  public int compare(Movie o1, Movie o2) {
    if (o2.year() == o1.year()) {
      return o1.title().compareTo(o2.title());
    }
    return o2.year().compareTo(o1.year());
  }

}
