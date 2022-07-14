package demos.movie.v1;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return Double.valueOf(o2.rating()).compareTo(o1.rating());
	}

}
