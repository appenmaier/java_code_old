package demos;

import java.util.ArrayList;
import demos.movie.Movie;

/**
 * Die Mutter aller Klassen
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava103 {

  public static void main(String[] args) {

    Movie movie1 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie movie2 = new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

    System.out.println(movie1);
    System.out.println(movie2);

    System.out.println(movie1 == movie2);
    System.out.println(movie1.equals(movie2));

    System.out.println("movie1.hashCode(): " + movie1.hashCode());
    System.out.println("movie2.hashCode(): " + movie2.hashCode());
    System.out.println("movie1.identyHashCode():" + System.identityHashCode(movie1));
    System.out.println("movie2.identyHashCode():" + System.identityHashCode(movie2));

  }

}
