package demos.tablelamp.v9;

import java.util.Objects;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public final class FlashLight extends Light {

	/*
	 * Attribute
	 */
	/**
	 * Batteriestatus
	 */
	private int batteryLevel;

	/*
	 * Konstruktoren
	 */
	public FlashLight() {
		super();
		batteryLevel = 100;
	}

	/*
	 * Setter und Getter
	 */
	public int getBatteryLevel() {
		return batteryLevel;
	}

	/*
	 * Methoden
	 */
	/**
	 * Schaltet die Taschenlampe ein
	 */
	public void switchOn() {
		isOn = true;

		if (batteryLevel > 0) {
			isShining = true;
		}

		batteryLevel -= 5;
	}

	/**
	 * Setzt den Batteriestatus auf 100%
	 */
	public void switchBattery() {
		batteryLevel = 100;
	}

	@Override
	public String toString() {
		return "FlashLight [isShining=" + isShining + ", isOn=" + isOn + ", batteryLevel=" + batteryLevel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryLevel);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FlashLight other = (FlashLight) obj;
		return batteryLevel == other.batteryLevel;
	}

}
