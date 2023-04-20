package demos.movie;

import java.util.ArrayList;
import java.util.Comparator;
import demos.movie.Movie05.Genre02;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 *
 */
@SuppressWarnings("unused")
public record Movie05(String title, ArrayList<Genre02> genres, String year, int runtimeInMinutes,
    double rating, int votes) implements Comparable<Movie05> {

  @Override
  public int compareTo(Movie05 other) {
    if (other.year.compareTo(year) == 0) {
      return title.compareTo(other.title);
    } else {
      return other.year.compareTo(year);
    }
  }

  public static class MovieByRatingDescendingComparator implements Comparator<Movie05> {

    @Override
    public int compare(Movie05 movie1, Movie05 movie2) {
      return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
    }

  }

  public static enum Genre02 {

    DRAMA("Drama"), ANIMATION("Animation"), CRIME("Crime"), FILM_NOIR("Film Noir"), FAMILY(
        "Family"), ADVENTURE("Adventure"), MYSTERY("Mystery"), DOCUMENTARY("Documentary"), FANTASY(
            "Fantasy"), HISTORY("History"), NEWS("News"), MUSIC("Music"), BIOGRAPHY(
                "Biography"), COMEDY("Comedy"), SCIENCE_FICTION("Science Fiction"), SPORT(
                    "Sport"), ROMANCE("Romance"), ACTION("Action"), THRILLER("Thriller"), HORROR(
                        "Horror"), WESTERN("Western"), WAR("War"), MUSICAL("Musical");

    private String name;

    Genre02(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

  }

}