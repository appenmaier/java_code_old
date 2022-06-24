package demos.tablelamp.v5;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Light {

	/*
	 * Attribute
	 */
	/**
	 * leuchtet?
	 */
	protected boolean isShining;

	/**
	 * eingeschaltet?
	 */
	protected boolean isOn;

	/*
	 * Konstruktoren
	 */
	public Light() {
		isOn = false;
		isShining = false;
	}

	/*
	 * Setter und Getter
	 */
	public boolean isOn() {
		return isOn;
	}

	public boolean isShining() {
		return isShining;
	}

	/*
	 * Methoden
	 */
	/**
	 * Schaltet die Lampe ein
	 */
	public void switchOn() {
		isOn = true;
		isShining = true;
	}

	/**
	 * Schaltet die Lampe aus
	 */
	public void switchOff() {
		isOn = false;
		isShining = false;
	}

	/**
	 * Gibt die Attribute der Lampe auf der Konsole aus
	 */
	public void print() {
		System.out.println("Light [isShining=" + isShining + ", isOn=" + isOn + "]");
	}

}
