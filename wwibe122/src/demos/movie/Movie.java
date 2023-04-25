package demos.movie;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record Movie(String title, String year, double rating) implements Comparable<Movie> {

  @Override
  public int compareTo(Movie other) {
    return title.compareTo(other.title);
  }

}
