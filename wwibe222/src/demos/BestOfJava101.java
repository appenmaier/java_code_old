package demos;

import java.util.ArrayList;

import demos.movie.Movie;

/**
 * Die Klasse ArrayList<E>
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava101 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = new ArrayList<>();

		Movie movie1 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
		Movie movie2 = new Movie("Evil Dead Rises", new ArrayList<>(), "2023", 97, 8.4, 686);
		Movie movie3 = new Movie("The Super Mario Bros. Movie", new ArrayList<>(), "2023", 92, 0, 0);

		movie1.getGenres().add("ACTION");
		movie1.getGenres().add("CRIME");
		movie1.getGenres().add("THRILLER");
		movie2.getGenres().add("HORROR");
		movie3.getGenres().add("ANIMATION");
		movie3.getGenres().add("ADVENTURE");
		movie3.getGenres().add("COMEDY");

		movies.add(movie1);
		movies.add(movie2);
		movies.add(0, movie3);

		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).getTitle());
		}

	}

}
