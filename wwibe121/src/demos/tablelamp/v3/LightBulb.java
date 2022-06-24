package demos.tablelamp.v3;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class LightBulb {

	/*
	 * Attribute
	 */
	/**
	 * Farbe
	 */
	private String color;

	/*
	 * Konstruktoren
	 */
	public LightBulb() {
		this.color = "weiss";
	}

	public LightBulb(String color) {
		this.color = color;
	}

	/*
	 * Setter und Getter
	 */
	public String getColor() {
		return color;
	}

}
