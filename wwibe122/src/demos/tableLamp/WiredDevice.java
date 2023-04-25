package demos.tableLamp;

/**
 * Kabelgebundenes Geraet
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public interface WiredDevice {

  void plugIn() throws AlreadyPluggedInException;

  void pullThePlug();

}
