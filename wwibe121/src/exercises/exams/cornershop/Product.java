package exercises.exams.cornershop;

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
