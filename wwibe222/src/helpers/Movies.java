package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import demos.movie.Movie05;
import demos.movie.Movie05.Genre02;

public class Movies {

  public static ArrayList<Movie05> getMovies(int entries) throws FileNotFoundException {
    ArrayList<Movie05> movies = new ArrayList<>();
    File file = new File("src/resources/movies.csv");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      String title = tokens[0];
      double rating = Double.valueOf(tokens[1]);
      int runtimeInMinutes = Integer.valueOf(tokens[2]);
      String year = tokens[3];
      ArrayList<Genre02> genres = new ArrayList<>();
      String[] genreTexts = tokens[4].split(",");
      for (String text : genreTexts) {
        Genre02 genre = Genre02.valueOf(text);
        genres.add(genre);
      }
      int votes = Integer.valueOf(tokens[5]);
      Movie05 movie = new Movie05(title, genres, year, runtimeInMinutes, rating, votes);
      movies.add(movie);
    }

    scanner.close();

    ArrayList<Movie05> tmp = new ArrayList<>();
    for (int i = 0; i < entries; i++) {
      Random random = new Random();
      int index = random.nextInt(movies.size());
      tmp.add(movies.get(index));
      movies.remove(index);
    }
    movies = tmp;

    return movies;
  }

}
