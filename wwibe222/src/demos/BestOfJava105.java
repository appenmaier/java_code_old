package demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import demos.movie.Genre02;
import demos.movie.Movie03;

/**
 * Lesen von Dateien
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava105 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Movie03> movies = new ArrayList<>();

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
			Movie03 movie = new Movie03(title, genres, year, runtimeInMinutes, rating, votes);
			movies.add(movie);
		}

		scanner.close();

		for (Movie03 m : movies) {
			System.out.println(m);
		}

	}

}
