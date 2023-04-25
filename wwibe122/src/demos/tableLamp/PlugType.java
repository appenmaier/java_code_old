package demos.tableLamp;

/**
 * Steckertyp
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public enum PlugType {

  /* Aufzaehlungskonstanten */
  TYPE_B("Typ-B", "NEMA-5", "Nordamerika"), TYPE_F("Typ-F (Schukostecker)", "CEE 7/4",
      "Europa"), TYPE_I("Typ-I", "AS/NZS 3112", "Australien");

  /* Attribute */
  private final String description;
  private final String norm;
  private final String region;

  /* Methoden */
  PlugType(String description, String norm, String region) {
    this.description = description;
    this.norm = norm;
    this.region = region;
  }

  public String description() {
    return description;
  }

  public String norm() {
    return norm;
  }

  public String region() {
    return region;
  }

}
