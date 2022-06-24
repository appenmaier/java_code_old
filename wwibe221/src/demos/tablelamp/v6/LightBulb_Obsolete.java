package demos.tablelamp.v6;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class LightBulb_Obsolete {

	/*
	 * Attribute
	 */
	/**
	 * Farbe
	 */
	private Color color;

	/*
	 * Konstruktoren
	 */
	public LightBulb_Obsolete() {
		this.color = Color.WHITE;
	}

	public LightBulb_Obsolete(Color color) {
		this.color = color;
	}

	/*
	 * Setter und Getter
	 */
	public Color getColor() {
		return color;
	}
	
}
