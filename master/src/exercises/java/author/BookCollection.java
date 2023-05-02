package exercises.java.author;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public record BookCollection(HashMap<Author, ArrayList<Book>> books) {

  public void addAuthor(Author author) throws Exception {
    if (books.containsKey(author)) {
      throw new Exception();
    }

    books.put(author, new ArrayList<>());
  }

  public void addBook(Author author, Book book) {
    if (!books.containsKey(author)) {
      books.put(author, new ArrayList<>(List.of(book)));

    }

    books.get(author).add(book);
  }

  public Optional<Author> getMostDiligentAuthor() {
    int numberOfBooks = 0;
    Optional<Author> mostDiligentAuthor = Optional.empty();
    for (Entry<Author, ArrayList<Book>> entry : books.entrySet()) {
      if (entry.getValue().size() > numberOfBooks) {
        numberOfBooks = entry.getValue().size();
        mostDiligentAuthor = Optional.of(entry.getKey());
      }
    }
    return mostDiligentAuthor;
  }

}
