package demos.movie;

import java.util.Comparator;

public class MovieByYearDescendingAndTitleAscendingComparator implements Comparator<Movie> {

  @Override
  public int compare(Movie o1, Movie o2) {
    if (o2.getYear() == o1.getYear()) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    return o2.getYear().compareTo(o1.getYear());
  }

}
