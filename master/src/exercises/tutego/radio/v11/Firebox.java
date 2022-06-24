package exercises.tutego.radio.v11;

/**
 * Feuermelder
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Firebox extends ElectronicDevice {

	public Firebox() {
		on();
	}

	public void off() {

	}

	public String toString() {
		return "Feuermelder [Leistung=" + getWatt() + " W" + ", ist an]";
	}

}
