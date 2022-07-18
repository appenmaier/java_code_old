package demos.tablelamp.v10;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 */
public record LightBulb(Color color) {

	/*
	 * Konstruktoren
	 */
	public LightBulb() {
		this(Color.WHITE);
	}

	/*
	 * Methoden
	 */
	public double getBrightness() {
		return Math.sqrt(0.299 * Math.pow(color.getRed(), 2) + 0.587 * Math.pow(color.getGreen(), 2)
				+ 0.114 * Math.pow(color.getBlue(), 2));
	}

}
