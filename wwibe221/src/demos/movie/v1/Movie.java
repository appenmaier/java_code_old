package demos.movie.v1;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Movie(String title, Genre genre, String publishingYear, double rating) implements Comparable<Movie> {

	/*
	 * Methoden
	 */
	@Override
	public int compareTo(Movie o) {
		return this.title().compareTo(o.title());
	}

}

//public final class Movie {
//
//	/*
//	 * Attribute
//	 */
//	private final String title;
////	private final String genre;
//	private final Genre genre;
//	private final String publishingYear;
//	private final double rating;
//
//	/*
//	 * Konstruktoren
//	 */
//	public Movie(String title, Genre genre, String publishingYear, double rating) {
//		super();
//		this.title = title;
//		this.genre = genre;
//		this.publishingYear = publishingYear;
//		this.rating = rating;
//	}
//
//	/*
//	 * Setter und Getter
//	 */
//	public String getTitle() {
//		return title;
//	}
//
//	public Genre getGenre() {
//		return genre;
//	}
//
//	public String getPublishingYear() {
//		return publishingYear;
//	}
//
//	public double getRating() {
//		return rating;
//	}
//	
//	/*
//	 * Methoden
//	 */
//	@Override
//	public int hashCode() {
//		return Objects.hash(genre, publishingYear, rating, title);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Movie other = (Movie) obj;
//		return genre == other.genre && Objects.equals(publishingYear, other.publishingYear)
//				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
//				&& Objects.equals(title, other.title);
//	}
//
//	@Override
//	public String toString() {
//		return "Movie [title=" + title + ", genre=" + genre + ", publishingYear=" + publishingYear + ", rating="
//				+ rating + "]";
//	}
//
//}
