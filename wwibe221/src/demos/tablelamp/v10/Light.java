package demos.tablelamp.v10;

import java.util.Objects;

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

	@Override
	public abstract String toString();

	@Override
	public int hashCode() {
		return Objects.hash(isOn, isShining);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Light other = (Light) obj;
		return isOn == other.isOn && isShining == other.isShining;
	}

}
