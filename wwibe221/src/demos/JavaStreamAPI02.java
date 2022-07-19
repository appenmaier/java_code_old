package demos;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import helpers.Movies;
import helpers.Movies.Movie;
import helpers.Movies.Movie.Genre;

/**
 * Intermediaere und Terminale Operationen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI02 {

	private static List<Movie> movies;

	public static void main(String[] args) throws FileNotFoundException {

		movies = Movies.getMovies();

		/*
		 * Intermediaere Operationen
		 */
		// Filtern (filter)
		filter();

		// Abbilden (flatMap, map, mapToInt, mapToDouble)
		map();

		// Sortieren (sorted)
		sort();

		// Ueberspringen, Begrenzen und Unterscheiden (skip, limit, distinct)
		skipAndLimitAndDistinct();

		/*
		 * Terminale Operationen
		 */
		// Finden (findAny, findFirst)
		find();

	}

	private static void filter() {
		System.out.println("Filtern (alle Filme der 90er):");

//		for (Movie m : movies) {
//			if (m.publishingYear().compareTo("1990") >= 0 && m.publishingYear().compareTo("2000") < 0) {
//				System.out.println(m);
//			}
//		}

		movies.stream()
				.filter(m -> m.publishingYear().compareTo("1990") >= 0)
				.filter(m -> m.publishingYear().compareTo("2000") < 0)
				.forEach(System.out::println);

		System.out.println();

	}

	private static void map() {
		System.out.println("Abbilden (FILMTITEL (Erscheinungsjahr)):");

//		for (Movie m : movies) {
//			String tmp = m.title().toUpperCase() + " (" + m.publishingYear() + ")";
//			System.out.println(tmp);
//		}

		movies.stream()
				.map(m -> m.title().toUpperCase() + " (" + m.publishingYear() + ")")
				.forEach(System.out::println);

		System.out.println();

	}

	private static void sort() {
		System.out.println("Sortieren (alle Filme aufsteigend nach Filmtitel):");

//		Collections.sort(movies, new Comparator<Movie>() {
//			@Override
//			public int compare(Movie m1, Movie m2) {
//				return m1.title().compareTo(m2.title());
//			}
//		});
//
//		for (Movie m : movies) {
//			System.out.println(m);
//		}

		movies.stream().sorted((m1, m2) -> m1.title().compareTo(m2.title())).forEach(System.out::println);

		System.out.println();

	}

	private static void skipAndLimitAndDistinct() {
		System.out.println("Ueberspringen, Begrenzen und Unterscheiden (Filme 6-10 ohne Duplikate):");

		movies.add(7, new Movie("Pulp Fiction", Genre.ACTION, "1994", 8.9));

//		HashSet<Movie> distinctMovies = new HashSet<>(movies);
//		System.out.println(movies.size());
//		System.out.println(distinctMovies.size());
//
//		for (int i = 5; i < 10; i++) {
//			System.out.println(movies.get(i));
//		}

		movies.stream().distinct().skip(5).limit(5).forEach(System.out::println);

		System.out.println();

	}

	private static void find() {
		System.out.println("Finden (ein beliebiger Thriller):");

//		ArrayList<Movie> thrillers = new ArrayList<>();
//		for (Movie m : movies) {
//			if (m.genre().equals(Genre.THRILLER)) {
//				thrillers.add(m);
//			}
//		}
//
//		Random random = new Random();
//		System.out.println(thrillers.get(random.nextInt(thrillers.size())));

		Optional<Movie> thriller = movies.stream().filter(m -> m.genre().equals(Genre.THRILLER)).findAny();
		System.out.println(thriller);

		System.out.println();

	}

}
