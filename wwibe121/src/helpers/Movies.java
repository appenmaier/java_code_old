package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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

	/*
	 * Innere Klassen
	 */
	public static record Movie(String title, Genre genre, String publishingYear, double rating) {

	}

	public static enum Genre {

		ADVENTURE("Abenteuer"), ACTION("Action"), DOCUMENTATION("Dokumentation"), DRAMA("Drama"), EROTIC("Erotik"),
		FANTASY("Fantasy"), BIOGRAPHY("Biographie"), COMEDY("Komödie"), HORROR("Horror"), WAR("Kriegsfilm"),
		LOVE("Liebsfilm"), MARTIAL_ARTS("Martial Arts"), MUSIC("Musikfilm"), PORNO("Porno"), ROAD("Roadmovie"),
		SCIENCE_FICTION("Science-Fiction"), SPORTS("Sportfilm"), THRILLER("Thriller"), WESTERN("Western");

		private final String description;

		Genre(String description) {
			this.description = description;
		}

		public String description() {
			return description;
		}

	}

	public static class MovieByTitleAscendingComparator implements Comparator<Movie> {

		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.title().compareTo(o2.title());
		}

	}

}
