package library;

/**
 * gedrucktes Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class PaperBook extends Book {

  private int pages;

  public PaperBook(Author author, String title, int pages) {
    super(author, title);
    this.pages = pages;
  }

  public int pages() {
    return pages;
  }

}
