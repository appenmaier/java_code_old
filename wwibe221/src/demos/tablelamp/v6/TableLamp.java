package demos.tablelamp.v6;

import java.util.Objects;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 6.0
 */
public class TableLamp extends Light {

	/*
	 * Attribute
	 */
	/**
	 * eingesteckt?
	 */
	private boolean isConnected;

	/**
	 * Gluehbirne
	 */
	private LightBulb lightBulb;

	/**
	 * Steckertyp
	 */
	private PlugType plugType;

	/**
	 * Anzahl Tischleuchten
	 */
	private static int numberOfTableLamps;

	/*
	 * Konstruktoren
	 */
	public TableLamp(PlugType plugType) {
		super();
		this.plugType = plugType;
		numberOfTableLamps++;
	}

	public TableLamp(PlugType plugType, LightBulb lightBulb) {
		super();
		this.plugType = plugType;
		this.lightBulb = lightBulb;
		numberOfTableLamps++;
	}

	/*
	 * Setter und Getter
	 */
	public boolean isConnected() {
		return isConnected;
	}

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	public PlugType getPlugType() {
		return plugType;
	}

	public static int getNumberOfTableLamps() {
		return numberOfTableLamps;
	}

	/*
	 * Methoden
	 */
	/**
	 * Steckt die Tischleuchte ein
	 */
	public void plugIn() {
		isConnected = true;

		if (isOn == true) {
			isShining = true;
		}
	}

	/**
	 * Steckt die Tischleuchte aus
	 */
	public void pullThePlug() {
		isConnected = false;
		isShining = false;
	}

	/**
	 * Schaltet die Tischleuchte ein
	 */
	public void switchOn() {
		isOn = true;

		if (isConnected == true) {
			isShining = true;
		}
	}

	/**
	 * Wechselt die Gluehbirne
	 * 
	 * @param LightBulb_Obsolete neue Gluehbirne
	 * @return alte Gluehbirne
	 */
	public LightBulb changeLightBulb(LightBulb newLightBulb) {
		LightBulb oldLightBulb = lightBulb;
		lightBulb = newLightBulb;
		return oldLightBulb;
	}

	@Override
	public String toString() {
		return "TableLamp [isShining=" + isShining + ", isOn=" + isOn + ", isConnected=" + isConnected
				+ ", lightBulb.color=" + (lightBulb != null ? lightBulb.getColor().toString() : "-")
				+ ", plugType.description=" + plugType.getDescription() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isConnected, lightBulb, plugType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TableLamp other = (TableLamp) obj;
		return isConnected == other.isConnected && Objects.equals(lightBulb, other.lightBulb)
				&& plugType == other.plugType;
	}

}
