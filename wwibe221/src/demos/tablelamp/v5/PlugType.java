package demos.tablelamp.v5;

/**
 * Steckertyp
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public enum PlugType {

	/*
	 * Aufzaehlungskonstanten
	 */
	TYPE_B("Typ-B", "NEMA-5", "Nordamerika"), TYPE_F("Typ-F (Schukostecker)", "CEE 7/4", "Europa"),
	TYPE_I("Typ-I", "AS/NZS 3112", "Australien");

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
	PlugType(String description, String norm, String region) {
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
