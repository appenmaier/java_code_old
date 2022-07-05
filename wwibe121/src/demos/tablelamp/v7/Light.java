package demos.tablelamp.v7;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public abstract class Light {

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
	public abstract void switchOn();

	/**
	 * Schaltet die Lampe aus
	 */
	public final void switchOff() {
		isOn = false;
		isShining = false;
	}

	/**
	 * Gibt die Attribute der Lampe auf der Konsole aus
	 */
	public abstract void print();

}
