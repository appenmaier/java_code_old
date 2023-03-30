package exercises.tutego.candy;

/**
 * Suessigkeitenart
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public enum CandyType02 {

  CARAMELS, CHOCOLATE, GUMMIES, LICORICE, LOLLIPOPS, CHEWING_GUMS, COTTON_CANDY;

  public static CandyType02 random() {
    CandyType02[] values = CandyType02.values();
    int index = (int) (Math.random() * values.length);
    return values[index];
  }

  public static CandyType02 fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType02 c : CandyType02.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

}
