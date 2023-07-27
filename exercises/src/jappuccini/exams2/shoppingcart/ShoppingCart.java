package jappuccini.exams2.shoppingcart;

import java.util.ArrayList;

/**
 * Warenkorb
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 * @param <T>
 */
public class ShoppingCart<T extends Sellable> {

  public class Item {

    private final T sellable;
    private final int amount;

    private Item(T sellable, int amount) {
      this.sellable = sellable;
      this.amount = amount;
    }

    public int amount() {
      return amount;
    }

    public double getSubTotal() {
      return sellable.price() * amount;
    }

    public T sellable() {
      return sellable;
    }

  }

  private final ArrayList<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void addItem(T sellable, int amount) {
    items.add(new Item(sellable, amount));
  }

  public double getTotal() {
    double total = 0;
    for (Item item : items) {
      total += item.getSubTotal();
    }
    return total;
  }

  public ArrayList<Item> items() {
    return items;
  }

  public void removeItem(T sellable) {
    for (Item i : items) {
      if (i.sellable.equals(sellable)) {
        items.remove(i);
      }
    }
  }

}
