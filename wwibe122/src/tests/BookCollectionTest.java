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
import exercises.java.bookcollection.DuplicateKeyException;

/**
 * BookCollectionTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BookCollectionTest {

  private BookCollection bookCollection;
  private Author stephenKing;
  private Author georgeRRMartin;
  private Book it;
  private Book misery;
  private Book aGameOfThrones;
  private Book aClashOfKings;

  @BeforeEach
  void setUp() throws DuplicateKeyException {
    stephenKing = new Author("Stephen King");
    georgeRRMartin = new Author("George RR Martin");

    it = new Book("Es");
    misery = new Book("Sie");
    aGameOfThrones = new Book("Das Lied von Eis und Feuer 1");
    aClashOfKings = new Book("Das Lied von Eis und Feuer 2");

    bookCollection = new BookCollection(new HashMap<>());
    bookCollection.addAuthor(stephenKing);
    bookCollection.addAuthor(georgeRRMartin);
    bookCollection.addBook(georgeRRMartin, aGameOfThrones);
    bookCollection.addBook(georgeRRMartin, aClashOfKings);
  }

  @Test
  void testAddAuthor() {
    assertThrows(DuplicateKeyException.class, () -> bookCollection.addAuthor(stephenKing));
  }

  @Test
  void testAddBook() {
    bookCollection.addBook(stephenKing, it);
    bookCollection.addBook(stephenKing, misery);
    List<Book> booksFromStephenKing = bookCollection.collection().get(stephenKing);
    assertEquals(it, booksFromStephenKing.get(0));
    assertEquals(misery, booksFromStephenKing.get(1));
    assertEquals(2, booksFromStephenKing.size());
  }

  @Test
  void testGetBookByTitle() {
    assertEquals(Optional.of(aClashOfKings),
        bookCollection.getBookByTitle("Das Lied von Eis und Feuer 2"));
    assertEquals(Optional.empty(), bookCollection.getBookByTitle("Das Lied von Eis und Feuer 3"));
  }

  @Test
  void testGetMostDiligentAuthor1() {
    assertEquals(Optional.of(georgeRRMartin), bookCollection.getMostDiligentAuthor());
  }

  @Test
  void testGetMostDiligentAuthor2() {
    bookCollection = new BookCollection(new HashMap<>());
    assertEquals(Optional.empty(), bookCollection.getMostDiligentAuthor());
  }

}
