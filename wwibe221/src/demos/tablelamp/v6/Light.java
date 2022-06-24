package demos.tablelamp.v6;

import java.util.Objects;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
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

	@Override
	public String toString() {
		return "Light [isShining=" + isShining + ", isOn=" + isOn + "]";
	}

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
