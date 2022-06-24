package exercises.tutego.radio.v3;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public class Radio {

	private boolean isOn;
	private int volume;

	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	public void on() {
		isOn = true;
		System.out.println("an");
	}

	public void off() {
		isOn = false;
		System.out.println("aus");
	}

	public boolean isOn() {
		return isOn;
	}

	public String toString() {
		return "Radio [Lautstaerke=" + volume + (isOn ? ", ist an]" : ", ist aus]");
	}

}
