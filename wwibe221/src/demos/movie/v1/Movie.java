package demos.movie.v1;

import java.util.Objects;

public class Movie {

	/*
	 * Attribute
	 */
	private String title;
//	private String genre;
	private Genre genre;
	private String publishingYear;
	private double rating;

	/*
	 * Konstruktoren
	 */
	public Movie(String title, Genre genre, String publishingYear, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.publishingYear = publishingYear;
		this.rating = rating;
	}

	/*
	 * Setter und Getter
	 */
	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getPublishingYear() {
		return publishingYear;
	}

	/*
	 * Methoden
	 */

	public double getRating() {
		return rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, publishingYear, rating, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Movie other = (Movie) obj;
		return genre == other.genre && Objects.equals(publishingYear, other.publishingYear)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", publishingYear=" + publishingYear + ", rating="
				+ rating + "]";
	}

}
