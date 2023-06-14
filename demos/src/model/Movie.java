package model;

import java.util.ArrayList;
import java.util.Comparator;
import model.Movie.Genre;

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
  /*
   * version 4.0: public record Movie(String title, Genre genre, double rating) implements
   * Comparable<Movie> {
   */
  /*
   * version 3.0: public record Movie(String title, Genre genre, double rating) implements
   * Comparable<Movie> {
   */
  /* version 2.0: public record Movie(String title, Genre genre, double rating) { */
  /*
   * version 1.0: public class Movie { private final String title; private final Genre genre;
   * private final double rating; public Movie(String title, Genre genre, double rating) {
   * this.title = title; this.genre = genre; this.rating = rating; } public String title() { return
   * title; } public String genre() { return genre; } public double rating() { return rating; }
   * public int hashCode() {...} public boolean equals(Object o) {...} public String toString()
   * {...}
   */

  @Override
  public int compareTo(Movie other) {
    if (other.year.compareTo(year) == 0) {
      return title.compareTo(other.title);
    } else {
      return other.year.compareTo(year);
    }
  }
  /* version 2.0: - */

  /**
   * MovieByRatingDescendingComparator
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public static class MovieByRatingDescendingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
      return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
    }

  }
  /* version 3.0: - */

  /**
   * MovieByYearDescendingAndTitleAscendingComparator
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public static class MovieByYearDescendingAndTitleAscendingComparator
      implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
      if (movie2.year() == movie1.year()) {
        return movie1.title().compareTo(movie2.title());
      }
      return movie2.year().compareTo(movie1.year());
    }

  }
  /* version 3.0: - */

  /**
   * Genre
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public enum Genre {

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
  /* version 3.0: - */

}
