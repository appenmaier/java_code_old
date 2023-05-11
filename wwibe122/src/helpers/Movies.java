package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import demos.movie.Movie;
import demos.movie.Movie.MovieGenre;

/**
 * Filme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movies {

  public static ArrayList<Movie> getMovies(int entries, int minVotes) throws FileNotFoundException {
    ArrayList<Movie> movies = new ArrayList<>();

    File file = new File("src/resources/movies.csv");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");

      String[] genreTexts = tokens[4].split(",");
      ArrayList<MovieGenre> genres = new ArrayList<>();
      for (String g : genreTexts) {
        genres.add(MovieGenre.valueOf(g));
      }

      Movie movie = new Movie(tokens[0], genres, tokens[3], Double.valueOf(tokens[1]),
          Integer.valueOf(tokens[2]), Integer.valueOf(tokens[5]));
      movies.add(movie);
    }
    scanner.close();

    movies.removeIf(m -> m.numberOfVotes() < minVotes);

    Random random = new Random();
    ArrayList<Movie> tmp = new ArrayList<>();
    for (int i = 0; i < entries; i++) {
      int index = random.nextInt(movies.size());
      tmp.add(movies.get(index));
      movies.remove(index);
    }

    movies = tmp;

    return movies;
  }

}
