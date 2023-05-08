package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import demos.movie.Movie;

/**
 * Filme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movies {

  public static ArrayList<Movie> getMovies() throws FileNotFoundException {
    ArrayList<Movie> movies = new ArrayList<>();

    File file = new File("");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");

      Movie movie = new Movie(tokens[0], null, tokens[3], Double.valueOf(tokens[1]),
          Integer.valueOf(tokens[2]), Integer.valueOf(tokens[5]));
      movies.add(movie);
    }
    scanner.close();
    return movies;
  }

}
