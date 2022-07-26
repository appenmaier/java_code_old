package demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import helpers.Movies;
import helpers.Movies.Genre;
import helpers.Movies.Movie;

/**
 * Intermediaere und Terminale Operationen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo47 {

	private static List<Movie> movies = Movies.getMovies();

	public static void main(String[] args) {

		// Filtern (filter)
		filter();

		// Abbilden (flatMap, map)
		map();

		// Sortieren (sorted)
		sort();

		// Ueberspringen, Begrenzen und Unterscheiden (skip, limit, distinct)
		skipAndLimitAndDistinct();

		// Sammeln (collect)
		collect();
		collectAndGroup();

		// Finden (findAny, findFirst)
		find();

		// Pruefen (allMatch, anyMatch, nonMatch)
		check();

		// Aggregieren (average, count, max, min, reduce, sum)
		aggregate();

		// Spaehen (peek)
		peek();

	}

	private static void filter() {
		System.out.println("Filtern (alle Filme zwischen 1990 und 2000):");

//		for (Movie movie : movies) {
//			if (movie.publishingYear().compareTo("1990") >= 0 && movie.publishingYear().compareTo("2000") < 0) {
//				System.out.println(movie);
//			}
//		}

		movies.stream()
				.filter(movie -> movie.publishingYear().compareTo("1990") >= 0
						&& movie.publishingYear().compareTo("2000") < 0)
				.forEach(System.out::println);

		System.out.println();
	}

	private static void map() {
		System.out.println("Abbilden (FILMTITEL):");

//		for (Movie movie : movies) {
//			String title = movie.title();
//			System.out.println(title.toUpperCase());
//		}

		movies.stream().map(movie -> movie.title().toUpperCase()).forEach(System.out::println);

		System.out.println();
	}

	private static void sort() {
		System.out.println("Sortieren (aufsteigend nach Filmtitel):");

//		Collections.sort(movies, (movie1, movie2) -> movie1.title().compareTo(movie2.title()));
//		for (Movie movie : movies) {
//			System.out.println(movie);
//		}

		movies.stream()
				.sorted((movie1, movie2) -> movie1.title().compareTo(movie2.title()))
				.forEach(System.out::println);

		System.out.println();
	}

	private static void skipAndLimitAndDistinct() {
		System.out.println("Ueberspringen, Begrenzen und Unterscheiden (Filme 6-10)");

//		HashSet<Movie> distinctMovies = new HashSet<>(movies);
//		for (int i = 5; i < 10; i++) {
//			System.out.println(movies.get(i));
//		}

		movies.stream().skip(5).limit(5).distinct().forEach(System.out::println);

		System.out.println();

	}

	private static void find() {
		System.out.println("Finden (ein beliebiger Thriller)");

//		ArrayList<Movie> thrillers = new ArrayList<>();
//		for (Movie movie : movies) {
//			if (movie.genre().equals(Genre.THRILLER)) {
//				thrillers.add(movie);
//			}
//		}
//		Random random = new Random();
//		System.out.println(thrillers.get(random.nextInt(thrillers.size())));

		System.out.println(movies.stream().filter(movie -> movie.genre().equals(Genre.THRILLER)).findAny());

		System.out.println();
	}

	private static void check() {
		System.out.println("Pruefen (gibt es einen Film aus dem Jahr 1990?)");

//		for (Movie movie : movies) {
//			if (movie.publishingYear().equals("1990")) {
//				System.out.println(true);
//			}
//		}

		System.out.println(movies.stream().anyMatch(movie -> movie.publishingYear().equals("1990")));

		System.out.println();
	}

	private static void aggregate() {
		System.out.println("Aggregieren (Durchschnittliche Bewertung aller Komödien):");

//		double total = 0;
//		int count = 0;
//		for (Movie movie : movies) {
//			if (movie.genre().equals(Genre.COMEDY)) {
//				total += movie.rating();
//				count++;
//			}
//		}
//		System.out.println(total / count);

		System.out.println(movies.stream()
				.filter(movie -> movie.genre().equals(Genre.COMEDY))
				.mapToDouble(movie -> movie.rating())
				.average()
				.getAsDouble());

		System.out.println();
	}

	private static void collect() {
		System.out.println("Sammeln (alle Filme nach 1999 aufsteigend sortiert nach Filmtitel):");

		List<Movie> filteredAndSortedMovies = new ArrayList<>();

//		for (Movie movie : movies) {
//			if (movie.publishingYear().compareTo("1999") > 0) {
//				filteredAndSortedMovies.add(movie);
//			}
//		}
//		Collections.sort(filteredAndSortedMovies, ((movie1, movie2) -> movie1.title().compareTo(movie2.title())));

		filteredAndSortedMovies = movies.stream()
				.filter(movie -> movie.publishingYear().compareTo("1999") > 0)
				.sorted((movie1, movie2) -> movie1.title().compareTo(movie2.title()))
				.collect(Collectors.toList());

		filteredAndSortedMovies.forEach(System.out::println);

		System.out.println();
	}

	private static void collectAndGroup() {
		System.out.println("Sammeln (alle Filme gruppiert nach Genre):");

		Map<Genre, List<Movie>> moviesByGenre;

//		for (Movie movie : movies) {
//
//		}

		moviesByGenre = movies.stream()
				.filter(movie -> movie.publishingYear().compareTo("1999") > 0)
				.sorted((movie1, movie2) -> movie1.title().compareTo(movie2.title()))
				.collect(Collectors.groupingBy(movie -> movie.genre()));

		System.out.println(moviesByGenre);

		System.out.println();
	}

	private static void peek() {
		System.out.println("Spaehen");

		movies.stream().peek(System.out::println).collect(Collectors.toList());
	}

}
