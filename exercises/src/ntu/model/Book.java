package ntu.model;

/**
 * Buch
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Book {

  private Author[] authors;
  /* version 1.0: private Author author; */
  private String name;
  private double price;
  private int qty;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }
  /*
   * version 1.0: public Book(String name, Author author, double price) { this.name = name;
   * this.author = author; this.price = price; }
   */

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }
  /*
   * version 1.0: public Book(String name, Author author, double price, int qty) { this.name = name;
   * this.author = author; this.price = price; this.qty = qty; }
   */

  public String getAuthorNames() {
    String authorNames = "";
    for (int i = 0; i < authors.length; i++) {
      authorNames += authors[i].getName();
      if (i != authors.length - 1) {
        authorNames += ", ";
      }
    }
    return authorNames;
  }
  /* version 1.0: public String getAuthorName() { return author.getName(); } */

  public Author[] getAuthors() {
    return authors;
  }
  /* version 1.0: public Author getAuthor() { return author; } */

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  @Override
  public String toString() {
    String string = "Book [name=" + name + ", authors={";
    for (int i = 0; i < authors.length; i++) {
      string += authors[i];
      if (i != authors.length - 1) {
        string += ", ";
      }
    }
    string += "}, price=" + price + ", qty=" + qty + "]";
    return string;
  }
  /*
   * version 1.0: public String toString() { return "Book[name=" + name + ", author=" + author +
   * ", price=" + price + ", qty=" + qty + "]"; }
   */

}
