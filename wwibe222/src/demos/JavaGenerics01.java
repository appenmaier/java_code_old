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

  public static void main(String[] args) {

    /* Outdated */
    // Box box = new Box();
    // box.setContent(42);
    // box.setContent(new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087));
    // box.setContent("Hallo Welt");
    //
    // if (box.getContent() instanceof Movie) {
    // Movie movie = (Movie) box.getContent();
    // System.out.println(movie);
    // }

    Box<Integer> box = new Box<>();
    box.setContent(42);
    int content = box.getContent();
    System.out.println(content);

    Box<Movie> box2 = new Box<>();
    box2.setContent(new Movie("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087));
    Movie movie = box2.getContent();
    System.out.println(movie);

    Box<String> box3 = new Box<>();
    box3.setContent("Hallo Welt");
    String text = box3.getContent();
    System.out.println(text);

  }

}
