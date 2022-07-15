package demos.movie.v2;

import java.util.Comparator;

import demos.movie.v2.Movie.Genre;

@SuppressWarnings("unused")
public record Movie(String title, Genre genre, String publishingYear, double rating) implements Comparable<Movie> {

	/* Methoden */
	@Override
	public int compareTo(Movie o) {
		return this.title().compareTo(o.title());
	}

	/* Innere Klassen */
	public static class MovieByRatingDescendingComparator implements Comparator<Movie> {

		@Override
		public int compare(Movie o1, Movie o2) {
			return Double.valueOf(o2.rating()).compareTo(o1.rating());
		}

	}

	public static enum Genre {

		/*
		 * Aufzählungskonstanten
		 */
		ADVENTURE("Abenteuer"), ACTION("Action"), DOCUMENTATION("Dokumentation"), DRAMA("Drama"), EROTIC("Erotik"),
		FANTASY("Fantasy"), BIOGRAPHY("Biographie"), COMEDY("Komödie"), HORROR("Horror"), WAR("Kriegsfilm"),
		LOVE("Liebsfilm"), MARTIAL_ARTS("Martial Arts"), MUSIC("Musikfilm"), PORNO("Porno"), ROAD("Roadmovie"),
		SCIENCE_FICTION("Science-Fiction"), SPORTS("Sportfilm"), THRILLER("Thriller"), WESTERN("Western");

		/*
		 * Attribute
		 */
		private String description;

		/*
		 * Konstruktoren
		 */
		private Genre(String description) {
			this.description = description;
		}

		/*
		 * Setter und Getter
		 */
		public String getDescription() {
			return description;
		}

	}

}