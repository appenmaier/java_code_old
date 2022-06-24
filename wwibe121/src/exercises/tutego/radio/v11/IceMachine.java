package exercises.tutego.radio.v11;

/**
 * Eismaschine
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class IceMachine extends ElectronicDevice {

	public String toString() {
		return "Eismaschine [Leistung=" + getWatt() + " W" + (isOn() ? ", ist an]" : ", ist aus]");
	}

}
