package demos.tablelamp.v4;

import java.awt.Color;

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
	private Color color;

	/*
	 * Konstruktoren
	 */
	public LightBulb() {
		this.color = Color.WHITE;
	}

	public LightBulb(Color color) {
		this.color = color;
	}

	/*
	 * Setter und Getter
	 */
	public Color getColor() {
		return color;
	}
	
}
