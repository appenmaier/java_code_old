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

//public class LightBulb {
//
//	/*
//	 * Attribute
//	 */
//	/**
//	 * Farbe
//	 */
//	private Color color;
//
//	/*
//	 * Konstruktoren
//	 */
//	public LightBulb() {
//		this.color = Color.WHITE;
//	}
//
//	public LightBulb(Color color) {
//		this.color = color;
//	}
//
//	/*
//	 * Setter und Getter
//	 */
//	public Color getColor() {
//		return color;
//	}
//
//	/*
//	 * Methoden
//	 */
//	@Override
//	public int hashCode() {
//		return Objects.hash(color);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		LightBulb other = (LightBulb) obj;
//		return Objects.equals(color, other.color);
//	}
//
//	@Override
//	public String toString() {
//		return "LightBulb [color=" + color + "]";
//	}
//
//}
