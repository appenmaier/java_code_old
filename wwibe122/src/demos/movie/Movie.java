package demos.movie;

import java.util.ArrayList;
import java.util.Comparator;
import demos.movie.Movie.MovieGenre;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
@SuppressWarnings("unused")
public record Movie(String title, ArrayList<MovieGenre> genres, String year, double rating,
    int runtime, int numberOfVotes) implements Comparable<Movie> {

  @Override
  public int compareTo(Movie other) {
    return title.compareTo(other.title);
  }

  public static class MovieByRatingDescendingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
      return Double.valueOf(o2.rating()).compareTo(o1.rating());
    }
  }

  public static enum MovieGenre {

    DRAMA("Drama"), ANIMATION("Animation"), CRIME("Crime"), FILM_NOIR("Film Noir"), FAMILY(
        "Family"), ADVENTURE("Adventure"), MYSTERY("Mystery"), DOCUMENTARY("Documentary"), FANTASY(
            "Fantasy"), HISTORY("History"), NEWS("News"), MUSIC("Music"), BIOGRAPHY(
                "Biography"), COMEDY("Comedy"), SCIENCE_FICTION("Science Fiction"), SPORT(
                    "Sport"), ROMANCE("Romance"), ACTION("Action"), THRILLER("Thriller"), HORROR(
                        "Horror"), WESTERN("Western"), WAR("War"), MUSICAL("Musical");

    private String name;

    MovieGenre(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

  }

}
