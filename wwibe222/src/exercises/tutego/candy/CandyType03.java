package exercises.tutego.candy;

/**
 * Suessigkeitenart
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 * 
 */
public enum CandyType03 {

  CARAMELS(9), CHOCOLATE(5), GUMMIES(4), LICORICE(3), LOLLIPOPS(2), CHEWING_GUMS(3), COTTON_CANDY(
      1);

  private int addictiveQuality;

  private CandyType03(int addictiveQuality) {
    this.addictiveQuality = addictiveQuality;
  }

  public static CandyType03 random() {
    CandyType03[] values = CandyType03.values();
    int index = (int) (Math.random() * values.length);
    return values[index];
  }

  public static CandyType03 fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType03 c : CandyType03.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

  public int addictiveQuality() {
    return addictiveQuality;
  }

  public CandyType03 next() {
    CandyType03[] values = CandyType03.values();
    int nextValue = Integer.MAX_VALUE;
    for (int i = 0; i < values.length; i++) {
      if (values[i].addictiveQuality() > this.addictiveQuality()
          && values[i].addictiveQuality() < nextValue) {
        nextValue = values[i].addictiveQuality();
      }
    }

    CandyType03 next = this;
    for (int i = 0; i < values.length; i++) {
      if (values[i].addictiveQuality() == nextValue) {
        if (next == this || Math.random() > 0.5) {
          next = values[i];
        }
      }
    }

    return next;
  }

}
