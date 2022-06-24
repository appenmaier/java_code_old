package demos.tablelamp.v9;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 * @version 2.0
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
	 * 
	 * @throws AlreadyPluggedInException
	 */
	public void plugIn() throws AlreadyPluggedInException {
		if (isPlugged) {
			throw new AlreadyPluggedInException();
		}
		
		isPlugged = true;
	}

	/**
	 * Steckt den Toaster aus
	 */
	public void pullThePlug() {
		isPlugged = false;
	}

}
