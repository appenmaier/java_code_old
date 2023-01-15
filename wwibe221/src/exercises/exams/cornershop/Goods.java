package exercises.exams.cornershop;

public class Goods extends Product implements Comparable<Goods> {

  private final ClassOfGoods classOfGoods;
  private final String unit;

  public Goods(String description, ClassOfGoods classOfGoods, double price, String unit) {
    super(description, price);
    this.classOfGoods = classOfGoods;
    this.unit = unit;
  }

  public ClassOfGoods classOfGoods() {
    return classOfGoods;
  }

  @Override
  public int compareTo(Goods other) {
    return description().compareTo(other.description());
  }

  public String unit() {
    return unit;
  }

}
