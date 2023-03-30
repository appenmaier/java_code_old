package demos.tableLamp;

/**
 * Steckertyp
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class PlugType {

  /* Aufzaehlungskonstanten */
  public final static PlugType TYPE_B = new PlugType("Typ-B", "NEMA-5", "Nordamerika");
  public final static PlugType TYPE_F = new PlugType("Typ-F (Schukostecker)", "CEE 7/4", "Europa");
  public final static PlugType TYPE_I = new PlugType("Typ-I", "AS/NZS 3112", "Australien");

  /* Attribute */
  private final String description;
  private final String norm;
  private final String region;

  /* Methoden */
  private PlugType(String description, String norm, String region) {
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
