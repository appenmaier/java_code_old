package demos.movie;

import java.util.Objects;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movie implements Comparable<Movie> {

  private final String title;
  private final String year;
  private final double rating;

  public Movie(String title, String year, double rating) {
    super();
    this.title = title;
    this.year = year;
    this.rating = rating;
  }

  @Override
  public int compareTo(Movie other) {
    return this.title.compareTo(other.title);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Movie other = (Movie) obj;
    return Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
        && Objects.equals(title, other.title) && Objects.equals(year, other.year);
  }

  public double getRating() {
    return rating;
  }

  public String getTitle() {
    return title;
  }

  public String getYear() {
    return year;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, title, year);
  }

  @Override
  public String toString() {
    return "Movie [title=" + title + ", year=" + year + ", rating=" + rating + "]";
  }

}
