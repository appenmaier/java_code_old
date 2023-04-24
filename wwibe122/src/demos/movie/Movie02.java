package demos.movie;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record Movie02(String title, String year, double rating) implements Comparable<Movie02> {

  @Override
  public int compareTo(Movie02 other) {
    return title.compareTo(other.title);
  }

}
