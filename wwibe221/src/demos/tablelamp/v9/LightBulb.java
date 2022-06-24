package demos.tablelamp.v9;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 3.0
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

	public double getBrightness() {
		return Math.sqrt(0.299 * Math.pow(color.getRed(), 2) + 0.587 * Math.pow(color.getGreen(), 2)
				+ 0.114 * Math.pow(color.getBlue(), 2));
	}

}
