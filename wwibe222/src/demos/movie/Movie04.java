package demos.movie;

import java.util.ArrayList;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public record Movie04(String title, ArrayList<Genre02> genres, String year, int runtimeInMinutes,
    double rating, int votes) implements Comparable<Movie04> {

  @Override
  public int compareTo(Movie04 other) {
    if (other.year.compareTo(year) == 0) {
      return title.compareTo(other.title);
    } else {
      return other.year.compareTo(year);
    }
  }

}
