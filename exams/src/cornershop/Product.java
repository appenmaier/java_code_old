package cornershop;

/**
 * Produkt
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Product {

  private final String description;
  private final double price;

  public Product(String description, double price) {
    this.description = description;
    this.price = price;
  }

  public String description() {
    return description;
  }

  public double price() {
    return price;
  }

}
