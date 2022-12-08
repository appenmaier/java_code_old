package exercises.tutego.candy.v2;

/**
 * Suessigkeitenart
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public enum CandyType {

  CARAMELS, CHOCOLATE, GUMMIES, LICORICE, LOLLIPOPS, CHEWING_GUMS, COTTON_CANDY;

  public static CandyType random() {
    CandyType[] values = CandyType.values();
    int index = (int) (Math.random() * values.length);
    return values[index];
  }

  public static CandyType fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType c : CandyType.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

}
