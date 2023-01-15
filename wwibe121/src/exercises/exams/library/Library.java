package exercises.exams.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public record Library(String name, HashMap<Book, Status> books) {

  public void addBook(Book book) {
    books.put(book, Status.AVAILABLE);
  }

  public Book getBookByTitle(String title) {
    for (Book b : books.keySet()) {
      if (b.title().equals(title)) {
        return b;
      }
    }
    return null;
  }

  public ArrayList<PaperBook> getPaperBooksByStatus(Status status) {
    ArrayList<PaperBook> paperBooks = new ArrayList<>();
    for (Entry<Book, Status> entry : books.entrySet()) {
      if (entry.getKey() instanceof PaperBook p && entry.getValue().equals(status)) {
        paperBooks.add(p);
      }
    }
    return paperBooks;
  }

}
