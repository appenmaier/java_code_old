package demos.tablelamp.v9;

/**
 * Kabelgebundenes Geraet
 * 
 * @author Daniel appenmaier
 * @version 2.0
 */
public interface WiredDevice {

	/*
	 * Methoden
	 */
	/**
	 * Steckt das kabelgebundene Geraet ein
	 */
	void plugIn() throws AlreadyPluggedInException;

	/**
	 * Steckt das kabelgebundene Geraet aus
	 */
	void pullThePlug();

}
