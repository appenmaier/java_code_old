package exercises.java;

import java.util.HashMap;
import exercises.java.bookcollection.Author;
import exercises.java.bookcollection.Book;
import exercises.java.bookcollection.BookCollection;
import exercises.java.bookcollection.DuplicateKeyException;

public class Maps02 {

  public static void main(String[] args) {

    BookCollection collection = new BookCollection(new HashMap<>());

    try {
      collection.addAuthor(new Author("Stephen King"));
      collection.addAuthor(new Author("George RR Martin"));
      collection.addAuthor(new Author("George RR Martin"));
    } catch (DuplicateKeyException e) {
      System.out.println("Fehler");
    }

    collection.addBook(new Author("Stephen King"), new Book("Es"));
    collection.addBook(new Author("Stephen King"), new Book("Sie"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 1"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 2"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 3"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 4"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 5"));
    collection.addBook(new Author("George RR Martin"), new Book("Das Lied von Eis und Feuer 6"));

    System.out.println(collection.getBookByTitle("Das Lied von Eis und Feuer 5"));
    System.out.println(collection.getMostDiligentAuthor());

  }

}
