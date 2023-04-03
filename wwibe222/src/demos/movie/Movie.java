package demos.movie;

import java.util.ArrayList;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 *
 */
public class Movie {

	private final String title;
	private final ArrayList<String> genres;
	private final String year;
	private final int runtimeInMinutes;
	private final double rating;
	private final int votes;

	public Movie(String title, ArrayList<String> genres, String year, int runtimeInMinutes, double rating, int votes) {
		super();
		this.title = title;
		this.genres = genres;
		this.year = year;
		this.runtimeInMinutes = runtimeInMinutes;
		this.rating = rating;
		this.votes = votes;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getGenres() {
		return genres;
	}

	public String getYear() {
		return year;
	}

	public int getRuntimeInMinutes() {
		return runtimeInMinutes;
	}

	public double getRating() {
		return rating;
	}

	public int getVotes() {
		return votes;
	}

}
