package jappuccini.main;

import java.util.HashMap;
import jappuccini.model.Author;
import jappuccini.model.Book;
import jappuccini.model.BookCollection;
import jappuccini.model.DuplicateKeyException;

public class Optionals01 {

  public static void main(String[] args) {

    BookCollection collection = new BookCollection(new HashMap<>());

    try {
      collection.addAuthor(new Author("Stephen King"));
      collection.addAuthor(new Author("George RR Martin"));
    } catch (DuplicateKeyException e) {
      e.printStackTrace();
    }

    collection.addBook(new Author("Stephen King"), new Book("Es"));
    collection.addBook(new Author("Stephen King"), new Book("Sie"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 1"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 2"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 3"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 4"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 5"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 6"));

    collection.getBookByTitle("Das Lied von Eis und Feuer 5").ifPresentOrElse(System.out::println,
        () -> System.out.println("Das gesuchte Buch ist nicht vorhanden"));
    collection.getMostDiligentAuthor().ifPresentOrElse(System.out::println,
        () -> System.out.println("Es ist kein entsprechender Autor vorhanden"));

  }

}
