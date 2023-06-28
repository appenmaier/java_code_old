package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
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
  private Book aGameOfThrones;
  private Book aClashOfKings;

  @BeforeEach
  void setUp() throws DuplicateKeyException {
    stephenKing = new Author("Stephen King");
    georgeRRMartin = new Author("George RR Martin");
    it = new Book("Es");
    aGameOfThrones = new Book("Das Lied von Eis und Feuer 1");
    aClashOfKings = new Book("Das Lied von Eis und Feuer 2");
    bookCollection = new BookCollection(new HashMap<>());
    bookCollection.addAuthor(stephenKing);
    bookCollection.addAuthor(georgeRRMartin);
    bookCollection.addBook(georgeRRMartin, aGameOfThrones);
    bookCollection.addBook(georgeRRMartin, aClashOfKings);
  }

  @Test
  void testAA() {
    assertThrows(DuplicateKeyException.class, () -> bookCollection.addAuthor(stephenKing));
  }

  @Test
  void testAB() {
    bookCollection.addBook(stephenKing, it);
    assertEquals(it, bookCollection.collection().get(stephenKing).get(0));
  }

  @Test
  void testGBBT() {
    assertEquals(Optional.of(aGameOfThrones),
        bookCollection.getBookByTitle("Das Lied von Eis und Feuer 1"));
    assertEquals(Optional.empty(), bookCollection.getBookByTitle("Es"));
  }

  @Test
  void testGMDA1() {
    assertEquals(Optional.of(georgeRRMartin), bookCollection.getMostDiligentAuthor());
    assertEquals(georgeRRMartin, bookCollection.getMostDiligentAuthor().get());
  }

  @Test
  void testGMDA2() {
    BookCollection emptyBookCollection = new BookCollection(new HashMap<>());
    assertEquals(Optional.empty(), emptyBookCollection.getMostDiligentAuthor());
  }

}
