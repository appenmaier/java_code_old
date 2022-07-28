package demos;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
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
public class JavaStreamAPI02 {

	private static List<Movie> movies;

	public static void main(String[] args) throws FileNotFoundException {

		movies = Movies.getMovies();

		/*
		 * Intermediaere Operationen
		 */
		// Filtern (filter)
		filter();

		// Abbilden (map, mapToInt, mapToDouble)
		map();

		// Sortieren (sorted)
		sort();

		// Ueberspringen und Begrenzen (skip, limit)
		skipAndLimit();

		// Duplikate entfernen (distinct)
		distinct();

		// Spaehen (peek)
		peek();

		/*
		 * Terminale Operationen
		 */
		// Ausfuehren (forEach)
		execute();

		// Finden (findAny, findFirst)
		find();

		// Pruefen (allMatch, anyMatch, noneMatch)
		check();

		// Aggregieren (average, count, max, min, reduce, sum)
		aggregate();

		// Sammeln (collect)
		collect();
		collectAndGroup();

	}

	private static void filter() {
		System.out.println("Filtern (alle Filme mit einer Bewertung von min. 7):");

//		for (Movie m : movies) {
//			if (m.rating() >= 7) {
//				System.out.println(m);
//			}
//		}

		movies.stream().filter(m -> m.rating() >= 7).forEach(System.out::println);

		System.out.println();
	}

	private static void map() {
		System.out.println("Abbilden (filmtitel (Erscheinungsjahr)):");

//		for (Movie m : movies) {
//			String tmp = m.title().toLowerCase() + " (" + m.publishingYear() + ")";
//			System.out.println(tmp);
//		}

		movies.stream()
				.map(m -> m.title().toLowerCase() + " (" + m.publishingYear() + ")")
				.forEach(System.out::println);

		System.out.println();
	}

	private static void sort() {
		System.out.println("Sortieren (aufsteigend nach dem Genre)");

//		Collections.sort(movies, new Comparator<Movie>() {
//			@Override
//			public int compare(Movie o1, Movie o2) {
//				return o1.genre().compareTo(o2.genre());
//			}
//		});
//		for (Movie m : movies) {
//			System.out.println(m);
//		}

		movies.stream().sorted((m1, m2) -> m1.genre().compareTo(m2.genre())).forEach(System.out::println);

		System.out.println();
	}

	private static void skipAndLimit() {
		System.out.println("Ueberspringen und Begrenzen (Filme 6-10)");

//		for (int i = 5; i < 10; i++) {
//			System.out.println(movies.get(i));
//		}

		movies.stream().skip(5).limit(5).forEach(System.out::println);

		System.out.println();
	}

	private static void distinct() {
		System.out.println("Duplikate entfernen");

		movies.add(new Movie("Der Pate 2", Genre.DRAMA, "1974", 9.0));

//		HashSet<Movie> tmp = new HashSet<>(movies);
//		ArrayList<Movie> distinctMovies = new ArrayList<>(tmp);
//		distinctMovies.forEach(System.out::println);

		movies.stream().distinct().forEach(System.out::println);

		System.out.println();
	}

	private static void peek() {
		System.out.println("Spaehen");

		List<Movie> moviesWithMin8Rating = movies.stream()
				.filter(m -> m.rating() > 8)
				.peek(System.out::println)
				.collect(Collectors.toList());

		moviesWithMin8Rating.forEach(System.out::println);

		System.out.println();
	}

	private static void execute() {
		System.out.println("Ausfuehren (gib alle Filme auf der Konsole aus)");

//		for (Movie m : movies) {
//			System.out.println(m);
//		}

		movies.stream().forEach(System.out::println);

		System.out.println();
	}

	private static void find() {
		System.out.println("Finden (einen beliebigen Thriller)");

//		Optional<Movie> thriller = Optional.ofNullable(null);
//		for (Movie m : movies) {
//			if (m.genre().equals(Genre.THRILLER)) {
//				thriller = Optional.of(m);
//				break;
//			}
//		}
//		System.out.println(thriller.isPresent() ? thriller.get() : "kein entsprechender Film vorhanden");
//		System.out.println(thriller.orElse(new Movie("Thriller", Genre.THRILLER, "2022", 5)));
//		thriller.ifPresent(System.out::println);

		Optional<Movie> thriller = movies.stream().filter(m -> m.genre().equals(Genre.THRILLER)).findAny();
		thriller.ifPresent(System.out::println);

//		if (thriller.isPresent()) {
//			System.out.println(thriller.get());
//		}

		System.out.println();
	}

	private static void check() {
		System.out.println("Pruefen (gibt es einen Film aus dem Jahr 1990?)");

//		boolean check = false;
//		for (Movie m : movies) {
//			if (m.publishingYear().equals("1990")) {
//				check = true;
//				break;
//			}
//		}
//		System.out.println(check);

		boolean check = movies.stream().anyMatch(m -> m.publishingYear().equals("1990"));
		System.out.println(check);

		System.out.println();
	}

	private static void aggregate() {
		System.out.println("Aggregate (durchschnittliche Bewertung aller Komoedien)");

//		double total = 0;
//		int count = 0;
//		double average;
//		for (Movie m : movies) {
//			if (m.genre().equals(Genre.COMEDY)) {
//				total += m.rating();
//				count++;
//			}
//		}
//		if (count > 0) {
//			average = total / count;
//			System.out.println(average);
//		}

		OptionalDouble average = movies.stream()
				.filter(m -> m.genre().equals(Genre.COMEDY))
				.mapToDouble(m -> m.rating())
				.average();
		average.ifPresent(System.out::println);

		System.out.println();
	}

	private static void collect() {
		System.out.println("Sammeln (alle Filme nach 1999 aufsteigend sortiert nach dem Filmtitel)");

		List<Movie> filteredAndSortedMovies = movies.stream()
				.filter(m -> m.publishingYear().compareTo("1999") > 0)
				.sorted((m1, m2) -> m1.title().compareTo(m2.title()))
				.collect(Collectors.toList());

		filteredAndSortedMovies.forEach(System.out::println);

		System.out.println();
	}

	private static void collectAndGroup() {
		System.out.println("Sammlen (alle Filme gruppiert nach dem Genre)");

		Map<Genre, List<Movie>> moviesByGenre = movies.stream().collect(Collectors.groupingBy(m -> m.genre()));

		for (Entry<Genre, List<Movie>> entry : moviesByGenre.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
