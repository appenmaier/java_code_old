package exercises.exams.library;

import java.util.UUID;

public abstract class Book {

  private final UUID id;
  private final Author author;
  private final String title;

  public Book(Author author, String title) {
    id = UUID.randomUUID();
    this.author = author;
    this.title = title;
  }

  public Author author() {
    return author;
  }

  public UUID id() {
    return id;
  }

  public String title() {
    return title;
  }

}
