package cornershop;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Tante-Emma-Laden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CornerShop(String name, TreeMap<Goods, Integer> store) {

  public Entry<Goods, Integer> getEntryByDescription(String description) {
    for (Entry<Goods, Integer> entry : store.entrySet()) {
      if (entry.getKey().description().equals(description)) {
        return entry;
      }
    }
    return null;
  }

  public void sellGoods(Goods goods, int amount) {
    Entry<Goods, Integer> entry = getEntryByDescription(goods.description());
    if (entry != null) {
      entry.setValue(entry.getValue() - amount);
    }
  }

  public void buyGoods(Goods goods, int amount) {
    Entry<Goods, Integer> entry = getEntryByDescription(goods.description());
    if (entry != null) {
      entry.setValue(entry.getValue() + amount);
    } else {
      store.put(goods, amount);
    }
  }

}
