package exams.exam2022q4.task02;

import java.util.ArrayList;

public class GiftBag {

  private final ArrayList<Present> presents;

  public GiftBag() {
    presents = new ArrayList<>();
  }

  public void addPresent(Present present) {
    presents.add(present);
  }

  public Present getMostExpensivePresent() {
    Present mostExpensivePresent = presents.get(0);
    double highestPrice = mostExpensivePresent.price();

    // for (int i = 1; i < presents.size(); i++) {
    // Present present = presents.get(i);
    // double price = present.price();
    // if (price > highestPrice) {
    // mostExpensivePresent = present;
    // highestPrice = price;
    // }
    // }

    for (Present present : presents) {
      double price = present.price();
      if (price > highestPrice) {
        mostExpensivePresent = present;
        highestPrice = price;
      }
    }

    return mostExpensivePresent;
  }

}
