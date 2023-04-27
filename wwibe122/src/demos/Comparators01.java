package demos;

import java.util.ArrayList;
import java.util.Collections;
import demos.movie.Movie;
import demos.movie.MovieByYearDescendingAndTitleAscendingComparator;

/**
 * Komparatoren
 * 
 * @author Daniel Appenmaier
 *
 */
public class Comparators01 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(2);

    ArrayList<String> names = new ArrayList<>();
    names.add("Hans");
    names.add("Peter");
    names.add("Lisa");

    ArrayList<Movie> movies = new ArrayList<>();
    /* Outdated */
    // movies.add(new Movie("John Wick 4", "2023", 8.4));
    // movies.add(new Movie("Disaster Movie", "2008", 2.1));
    // movies.add(new Movie("Der Pate", "1972", 9.2));
    // movies.add(new Movie("The Super Mario Bros. Movie", "2023", 7.2));

    Collections.sort(numbers);
    Collections.sort(names);
    Collections.sort(movies);
    Collections.sort(movies, new MovieByYearDescendingAndTitleAscendingComparator());

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    for (String name : names) {
      System.out.println(name);
    }

    for (Movie m : movies) {
      System.out.println(m);
    }

  }

}
