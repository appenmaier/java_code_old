package exercises.tutego.radio.v9;

import java.util.ArrayList;

/**
 * Schiff
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Ship {

	private ArrayList<Radio> radios;

	public Ship() {
		radios = new ArrayList<>();
	}

	public void addRadio(Radio radio) {
		radios.add(radio);
	}

	public void addAllRadios(Radio... radios) {
		for (Radio r : radios) {
			addRadio(r);
		}
	}

	public int numberOfRadiosSwitchedOn() {
		int count = 0;

		for (Radio r : radios) {
			if (r.isOn()) {
				count++;
			}
		}

		return count;
	}

	public String toString() {
		String text = "";
		for (Radio r : radios) {
			text += r.toString() + "\n";
		}
		text += "Anzahl eingeschalteter Radios: " + numberOfRadiosSwitchedOn() + "\n";
		return text;
	}

}
