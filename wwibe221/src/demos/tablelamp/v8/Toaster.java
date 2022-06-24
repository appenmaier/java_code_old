package demos.tablelamp.v8;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Toaster implements WiredDevice {

	/*
	 * Attribute
	 */
	private boolean isPlugged;

	/*
	 * Setter und Getter
	 */
	public boolean isPlugged() {
		return isPlugged;
	}

	/*
	 * Methoden
	 */
	/**
	 * Steckt den Toaster ein
	 */
	public void plugIn() {
		isPlugged = true;
	}

	/**
	 * Steckt den Toaster aus
	 */
	public void pullThePlug() {
		isPlugged = false;
	}

}
