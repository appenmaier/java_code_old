package demos;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

		// Abbilden (map, mapToInt, mapToDouble)
		map();

		// Sortieren (sorted)
		sort();

		// Ueberspringen und Begrenzen (skip, limit)
		skipAndLimit();

		// Duplikate entfernen (distinct)
		distinct();

		/*
		 * Terminale Operationen
		 */
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

	private static void skipAndLimit() {
		System.out.println("Ueberspringen und Begrenzen(Filme 6-10):");

//		for (int i = 5; i < 10; i++) {
//			System.out.println(movies.get(i));
//		}

		movies.stream().skip(5).limit(5).forEach(System.out::println);

		System.out.println();
	}

	private static void distinct() {
		System.out.println("Duplikate entfernen:");

		movies.add(new Movie("Pulp Fiction", Genre.ACTION, "1994", 8.9));

//		HashSet<Movie> tmp = new HashSet<>(movies);
//		ArrayList<Movie> distinctMovies = new ArrayList<>(tmp);
//
//		for (Movie m : distinctMovies) {
//			System.out.println(m);
//		}

		movies.stream().distinct().forEach(System.out::println);

		System.out.println();
	}

	private static void find() {
		System.out.println("Finden (ein beliebiger Thriller):");

//		Optional<Movie> thriller = Optional.ofNullable(null);
//		for (Movie m : movies) {
//			if (m.genre().equals(Genre.THRILLER)) {
//				thriller = Optional.of(m);
//				break;
//			}
//		}
//		System.out.println(thriller.isPresent() ? thriller.get() : "Es wurde kein Thriller gefunden");
//		System.out.println(thriller.orElse(new Movie("Thriller", Genre.THRILLER, "2022", 10)));
//		thriller.ifPresent(System.out::println);

		Optional<Movie> thriller = movies.stream().filter(m -> m.genre().equals(Genre.THRILLER)).findAny();
		thriller.ifPresent(System.out::println);

		System.out.println();
	}

	private static void check() {
		System.out.println("Pruefen (gibt es einen Film aus dem Jahr 1990?):");

		boolean check = false;

//		for (Movie m : movies) {
//			if (m.publishingYear().equals("1990")) {
//				check = true;
//			}
//		}

		check = movies.stream().anyMatch(m -> m.publishingYear().equals("1990"));

		System.out.println(check);

		System.out.println();
	}

	private static void aggregate() {
		System.out.println("Aggregieren (Durchschnittliche Bewertung aller Komoedien)");

//		double average = 0;
//		double total = 0;
//		int count = 0;
//		for (Movie m : movies) {
//			if (m.genre().equals(Genre.COMEDY)) {
//				total += m.rating();
//				count++;
//			}
//		}
//		average = total / count;

		OptionalDouble average = movies.stream()
				.filter(m -> m.genre().equals(Genre.COMEDY))
				.mapToDouble(m -> m.rating())
				.average();

		average.ifPresent(System.out::println);

		System.out.println();
	}

	private static void collect() {
		System.out.println("Sammeln (alle Filme nach 1999 aufsteigend sortiert nach dem Filmtitel):");

		List<Movie> filteredAndSortedMovies = movies.stream()
				.filter(m -> m.publishingYear().compareTo("1999") > 0)
				.sorted((m1, m2) -> m1.title().compareTo(m2.title()))
				.collect(Collectors.toList());

		filteredAndSortedMovies.forEach(System.out::println);

		System.out.println();
	}

	private static void collectAndGroup() {
		System.out.println("Sammeln (alle Filme gruppiert nach Genre):");

		Map<Genre, List<Movie>> moviesByGenre = movies.stream().collect(Collectors.groupingBy(m -> m.genre()));

		for (Entry<Genre, List<Movie>> entry : moviesByGenre.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
