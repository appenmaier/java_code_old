package demos.tablelamp.v3;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public class TableLamp {

	/*
	 * Attribute
	 */
	/**
	 * leuchtet?
	 */
	private boolean isShining;

	/**
	 * eingeschaltet?
	 */
	private boolean isOn;

	/**
	 * eingesteckt?
	 */
	private boolean isConnected;

	/**
	 * Gluehbirne
	 */
	private LightBulb lightBulb;

	/**
	 * Anzahl Tischleuchten
	 */
	private static int numberOfTableLamps;

	/*
	 * Konstruktoren
	 */
	public TableLamp() {
		numberOfTableLamps++;
	}

	public TableLamp(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
		numberOfTableLamps++;
	}

	/*
	 * Setter und Getter
	 */
	public boolean isConnected() {
		return isConnected;
	}

	public boolean isOn() {
		return isOn;
	}

	public boolean isShining() {
		return isShining;
	}

	public LightBulb getLightBulb() {
		return lightBulb;
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
	 * Schaltet die Tischleuchte aus
	 */
	public void switchoff() {
		isOn = false;
		isShining = false;
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

	/**
	 * Gibt die Attribute der Tischleuchte auf der Konsole aus
	 */
	public void print() {
		System.out.println("TableLamp [isShining=" + isShining + ", isOn=" + isOn + ", isConnected=" + isConnected
				+ ", lightBulb.color=" + (lightBulb != null ? lightBulb.getColor().toString() : "-") + "]");
	}

}
