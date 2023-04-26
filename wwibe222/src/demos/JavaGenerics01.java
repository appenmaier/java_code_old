package demos;

import java.util.ArrayList;
import demos.box.Box;
import demos.movie.Movie;

/**
 * Java Generics
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaGenerics01 {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void main(String[] args) {

    Box objectBox = new Box();
    objectBox.setContent(42);
    objectBox.setContent(new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087));
    objectBox.setContent("Hallo Welt");

    if (objectBox.getContent() instanceof Movie) {
      Movie movie = (Movie) objectBox.getContent();
      System.out.println(movie);
    }

    Box<Integer> integerBox = new Box<>();
    integerBox.setContent(42);
    int content = integerBox.getContent();
    System.out.println(content);

    Box<Movie> movieBox = new Box<>();
    movieBox.setContent(new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087));
    Movie movie = movieBox.getContent();
    System.out.println(movie);

    Box<String> stringBox = new Box<>();
    stringBox.setContent("Hallo Welt");
    String text = stringBox.getContent();
    System.out.println(text);

  }

}
