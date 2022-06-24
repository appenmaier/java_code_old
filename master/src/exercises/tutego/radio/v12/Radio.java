package exercises.tutego.radio.v12;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 12.0
 */
public class Radio extends ElectronicDevice {

	// private boolean isOn;
	private int volume;
	private double frequency;
	private Modulation modulation;
	@SuppressWarnings("unused")
	private double minFrequency;
	@SuppressWarnings("unused")
	private double maxFrequency;

	public Radio() {
	}

	public Radio(double frequency) {
		this.frequency = frequency;
	}

	public Radio(String sender) {
		frequency = Radio.senderToFrequency(sender);
	}

	public Radio(Radio r) {
		if (r.isOn()) {
			on();
		}
		volume = r.getVolume();
		frequency = r.getFrequency();
		modulation = r.getModulation();
	}

	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	// public void on() {
	// isOn = true;
	// System.out.println("an");
	// }

	// public void off() {
	// isOn = false;
	// System.out.println("aus");
	// }

	// public boolean isOn() {
	// return isOn;
	// }

	public String toString() {
		return "Radio [Lautstaerke=" + volume + ", Frequenz=" + frequency + " MHz"
				+ (modulation == null ? "" : ", Modulation=" + modulation.toString()) + ", Leistung=" + getWatt() + " W"
				+ (isOn() ? ", ist an]" : ", ist aus]");
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public double getFrequency() {
		return frequency;
	}

	public int getVolume() {
		return volume;
	}

	public static double senderToFrequency(String sender) {
		switch (sender) {
		case "DASDING":
			return 107.2;
		default:
			return 0;
		}
	}

	public void setModulation(Modulation modulation) {
		this.modulation = modulation;
		if (modulation.equals(Modulation.AM)) {
			minFrequency = 0.1485;
			maxFrequency = 26.1;
		} else {
			minFrequency = 87.5;
			maxFrequency = 108;
		}
	}

	public Modulation getModulation() {
		return modulation;
	}

	/**
	 * Modulation
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 */
	public enum Modulation {

		AM, FM

	}

}
