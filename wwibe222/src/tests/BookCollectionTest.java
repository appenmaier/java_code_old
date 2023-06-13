package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exercises.java.bookcollection.Author;
import exercises.java.bookcollection.Book;
import exercises.java.bookcollection.BookCollection;
import exercises.java.bookcollection.BookCollection.DuplicateKeyException;

public class BookCollectionTest {

  private BookCollection bookCollection;

  @BeforeEach
  void setUp() throws DuplicateKeyException {
    HashMap<Author, List<Book>> collection = new HashMap<>();
    bookCollection = new BookCollection(collection);
    bookCollection.addAuthor(new Author("Stephen King"));
    bookCollection.addAuthor(new Author("George RR Martin"));
    bookCollection.addBook(new Author("George RR Martin"),
        new Book("Das Lied von Eis und Feuer 1"));
    bookCollection.addBook(new Author("George RR Martin"),
        new Book("Das Lied von Eis und Feuer 2"));
  }

  @Test
  void testAddAuthor() {
    assertThrows(DuplicateKeyException.class,
        () -> bookCollection.addAuthor(new Author("Stephen King")));
  }

  @Test
  void testAddBook() {
    bookCollection.addBook(new Author("Stephen King"), new Book("Es"));
    List<Book> booksFromStephenKing = bookCollection.collection().get(new Author("Stephen King"));
    assertEquals(new Book("Es"), booksFromStephenKing.get(0));
    assertEquals(1, booksFromStephenKing.size());
    bookCollection.addBook(new Author("Stephen King"), new Book("Misery"));
    booksFromStephenKing = bookCollection.collection().get(new Author("Stephen King"));
    assertEquals(2, booksFromStephenKing.size());
  }

  @Test
  void testGetBookByTitle() {
    assertEquals(Optional.of(new Book("Das Lied von Eis und Feuer 2")),
        bookCollection.getBookByTitle("Das Lied von Eis und Feuer 2"));
    assertEquals(Optional.empty(), bookCollection.getBookByTitle("Sie"));
  }

  @Test
  void testGetMostDiligentAuthor() {
    assertEquals(Optional.of(new Author("George RR Martin")),
        bookCollection.getMostDiligentAuthor());
  }

}
