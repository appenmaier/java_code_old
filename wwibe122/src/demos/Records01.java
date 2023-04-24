package demos;

import demos.movie.Movie;
import demos.movie.Movie02;

/**
 * Datenklassen (Records)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Records01 {

  public static void main(String[] args) {

    Movie movie = new Movie("John Wick 4", "2023", 8.4);
    Movie copyOfMovie = new Movie("John Wick 4", "2023", 8.4);

    System.out.println(movie.getTitle());
    System.out.println(movie.hashCode());
    System.out.println(copyOfMovie.hashCode());
    System.out.println(movie.equals(copyOfMovie));
    System.out.println(movie);

    Movie02 movieRecord = new Movie02("John Wick 4", "2023", 8.4);
    Movie02 copyOfMovieRecord = new Movie02("John Wick 4", "2023", 8.4);

    System.out.println(movieRecord.title());
    System.out.println(movieRecord.hashCode());
    System.out.println(copyOfMovieRecord.hashCode());
    System.out.println(movieRecord.equals(copyOfMovieRecord));
    System.out.println(movieRecord);



  }

}
