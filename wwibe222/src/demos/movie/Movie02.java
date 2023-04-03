package demos.movie;

import java.util.ArrayList;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 *
 */
public class Movie02 {

  private final String title;
  private final ArrayList<String> genres;
  private final String year;
  private final int runtimeInMinutes;
  private final double rating;
  private final int votes;

  public Movie02(String title, ArrayList<String> genres, String year, int runtimeInMinutes,
      double rating, int votes) {
    super();
    this.title = title;
    this.genres = genres;
    this.year = year;
    this.runtimeInMinutes = runtimeInMinutes;
    this.rating = rating;
    this.votes = votes;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Movie02 other = (Movie02) obj;
    if (genres == null) {
      if (other.genres != null)
        return false;
    } else if (!genres.equals(other.genres))
      return false;
    if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
      return false;
    if (runtimeInMinutes != other.runtimeInMinutes)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    if (votes != other.votes)
      return false;
    if (year == null) {
      if (other.year != null)
        return false;
    } else if (!year.equals(other.year))
      return false;
    return true;
  }

  public ArrayList<String> getGenres() {
    return genres;
  }

  public double getRating() {
    return rating;
  }

  public int getRuntimeInMinutes() {
    return runtimeInMinutes;
  }

  public String getTitle() {
    return title;
  }

  public int getVotes() {
    return votes;
  }

  public String getYear() {
    return year;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((genres == null) ? 0 : genres.hashCode());
    long temp;
    temp = Double.doubleToLongBits(rating);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + runtimeInMinutes;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + votes;
    result = prime * result + ((year == null) ? 0 : year.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "Movie02 [title=" + title + ", genres=" + genres + ", year=" + year
        + ", runtimeInMinutes=" + runtimeInMinutes + ", rating=" + rating + ", votes=" + votes
        + "]";
  }

}
