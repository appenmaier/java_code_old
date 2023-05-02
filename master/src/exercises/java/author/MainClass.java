package exercises.java.author;

import java.util.HashMap;

public class MainClass {

  public static void main(String[] args) {

    BookCollection collection = new BookCollection(new HashMap<>());

    try {
      collection.addAuthor(new Author("Stephen King"));
      collection.addBook(new Author("Stephen King"), new Book("Es"));
      collection.addBook(new Author("Stephen King"), new Book("Der Dunkle Turm"));
      collection.addAuthor(new Author("George R.R. Martin"));
      collection.addBook(new Author("George R.R. Martin"), new Book("Das Lied von Eis und Feuer"));
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(collection);

  }

}
