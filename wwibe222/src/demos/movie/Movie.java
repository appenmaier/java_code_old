package demos.movie;

import java.util.ArrayList;
import java.util.Comparator;
import demos.movie.Movie.Genre;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 *
 */
@SuppressWarnings("unused")
public record Movie(String title, ArrayList<Genre> genres, String year, int runtimeInMinutes,
    double rating, int votes) implements Comparable<Movie> {

  @Override
  public int compareTo(Movie other) {
    if (other.year.compareTo(year) == 0) {
      return title.compareTo(other.title);
    } else {
      return other.year.compareTo(year);
    }
  }

  public static class MovieByRatingDescendingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
      return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
    }

  }

  public static enum Genre {

    DRAMA("Drama"), ANIMATION("Animation"), CRIME("Crime"), FILM_NOIR("Film Noir"), FAMILY(
        "Family"), ADVENTURE("Adventure"), MYSTERY("Mystery"), DOCUMENTARY("Documentary"), FANTASY(
            "Fantasy"), HISTORY("History"), NEWS("News"), MUSIC("Music"), BIOGRAPHY(
                "Biography"), COMEDY("Comedy"), SCIENCE_FICTION("Science Fiction"), SPORT(
                    "Sport"), ROMANCE("Romance"), ACTION("Action"), THRILLER("Thriller"), HORROR(
                        "Horror"), WESTERN("Western"), WAR("War"), MUSICAL("Musical");

    private String name;

    Genre(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

  }

}
