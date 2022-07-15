package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import demos.movie.v2.Movie;
import demos.movie.v2.Movie.Genre;

/**
 * Filme
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movies {

	/*
	 * Setter und Getter
	 */
	public static ArrayList<Movie> getMovies() throws FileNotFoundException {
		ArrayList<Movie> movies = new ArrayList<>();

		File file = new File("src/resources/movies.csv");

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split(";");
			String title = tokens[0];
			Genre genre = Genre.valueOf(tokens[1]);
			String publishingYear = tokens[2];
			double rating = Double.valueOf(tokens[3]);

			Movie movie = new Movie(title, genre, publishingYear, rating);
			movies.add(movie);
		}

		scanner.close();

		return movies;
	}

}
