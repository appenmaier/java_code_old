package ntu.main;

import ntu.model.Author;
import ntu.model.Book;

/**
 * Aufgabe OOP 2.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E010N_OOP22 {

  public static void main(String[] args) {

    Author[] authors = new Author[2];
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

    Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
    System.out.println(javaDummy);

  }

}
