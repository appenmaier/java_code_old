package demos.tablelamp.v10;

/**
 * Kabelgebundenes Gerät
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface WiredDevice {

	void plugIn() throws AlreadyPluggedInException;

	void pullThePlug();

}
