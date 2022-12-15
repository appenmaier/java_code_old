package exercises.tutego.candy;

/**
 * Suessigkeitenart
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public enum CandyType_v2 {

  CARAMELS, CHOCOLATE, GUMMIES, LICORICE, LOLLIPOPS, CHEWING_GUMS, COTTON_CANDY;

  public static CandyType_v2 random() {
    CandyType_v2[] values = CandyType_v2.values();
    int index = (int) (Math.random() * values.length);
    return values[index];
  }

  public static CandyType_v2 fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType_v2 c : CandyType_v2.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

}
