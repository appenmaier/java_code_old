package demos.tablelamp.v4;

/**
 * Steckertyp
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class PlugType_Obsolete {

	/*
	 * Aufzaehlungskonstanten
	 */
	/**
	 * Typ-B
	 */
	public final static PlugType_Obsolete TYPE_B = new PlugType_Obsolete("Typ-B", "NEMA-5", "Nordamerika");

	/**
	 * Typ-F (Schukostecker)
	 */
	public final static PlugType_Obsolete TYPE_F = new PlugType_Obsolete("Typ-F (Schukostecker)", "CEE 7/4", "Europa");

	/**
	 * Typ-I
	 */
	public final static PlugType_Obsolete TYPE_I = new PlugType_Obsolete("Typ-I", "AS/NZS 3112", "Australien");

	/*
	 * Attribute
	 */
	/**
	 * Beschreibung
	 */
	private String description;

	/**
	 * Norm
	 */
	private String norm;

	/**
	 * Hauptverbreitungsgebiet
	 */
	private String region;

	/*
	 * Konstruktoren
	 */
	private PlugType_Obsolete(String description, String norm, String region) {
		this.description = description;
		this.norm = norm;
		this.region = region;
	}

	/*
	 * Setter und Getter
	 */
	public String getDescription() {
		return description;
	}

	public String getNorm() {
		return norm;
	}

	public String getRegion() {
		return region;
	}

}
