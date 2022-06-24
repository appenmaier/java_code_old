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
	 * Konstruktoren
	 */
	private Movies() {
	}

	/*
	 * Setter und Getter
	 */
	public static ArrayList<Movie> getMovies() {
		ArrayList<Movie> movies = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File("src/resources/movies.csv"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split(";");
				Movie movie = new Movie(tokens[0], Genre.valueOf(tokens[1]), tokens[2], Double.valueOf(tokens[3]));
				movies.add(movie);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return movies;
	}

	/*
	 * Innere Klassen
	 */
	/**
	 * Film
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public static record Movie(String title, Genre genre, String publishingYear, double rating) {

	}

	/**
	 * Genre
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public static enum Genre {

		ADVENTURE, ACTION, DOCUMENTATION, DRAMA, EROTIC, FANTASY, BIOGRAPHY, COMEDY, HORROR, WAR, LOVE, MARTIAL_ARTS,
		MUSIC, PORNO, ROAD, SCIENCE_FICTION, SPORTS, THRILLER, WESTERN;

	}

	/**
	 * MovieByDescription
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 * 
	 */
	public static class MovieByTitleComparator implements Comparator<Movie> {

		@Override
		public int compare(Movie m1, Movie m2) {
			return m1.title.compareTo(m2.title);
		}

	}

}
