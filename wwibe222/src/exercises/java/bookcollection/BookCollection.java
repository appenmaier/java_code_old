package exercises.java.bookcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Buechersammlung
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record BookCollection(HashMap<Author, List<Book>> collection) {

  @SuppressWarnings("serial")
  public static class DuplicateKeyException extends Exception {
  }

  public void addAuthor(Author author) throws DuplicateKeyException {
    if (collection.containsKey(author)) {
      throw new DuplicateKeyException();
    }

    collection.put(author, new ArrayList<>());
  }

  public void addBook(Author author, Book book) {
    if (!collection.containsKey(author)) {
      collection.put(author, new ArrayList<>());
    }

    collection.get(author).add(book);
  }

  public Optional<Author> getMostDiligentAuthor() {
    Optional<Author> mostDiligentAuthor = Optional.empty();
    int mostBooks = 0;
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
      if (entry.getValue().size() > mostBooks) {
        mostBooks = entry.getValue().size();
        mostDiligentAuthor = Optional.of(entry.getKey());
      }
    }
    return mostDiligentAuthor;
  }

  public Optional<Book> getBookByTitle(String title) {
    for (List<Book> books : collection.values()) {
      for (Book b : books) {
        if (b.title().equals(title)) {
          return Optional.of(b);
        }
      }
    }
    return Optional.empty();
  }

}
