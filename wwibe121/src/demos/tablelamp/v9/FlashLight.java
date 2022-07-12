package demos.tablelamp.v9;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
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

	/**
	 * Gibt die Attribute der Taschenlampe auf der Konsole aus
	 */
	public void print() {
		System.out.println(
				"FlashLight [isShining=" + isShining + ", isOn=" + isOn + ", batteryLevel=" + batteryLevel + "]");
	}

}
