package exercises.tutego.radio.v2;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Radio {

	boolean isOn;
	int volume;

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

	void on() {
		isOn = true;
		System.out.println("an");
	}

	void off() {
		isOn = false;
		System.out.println("aus");
	}

	boolean isOn() {
		return isOn;
	}

	public String toString() {
		return "Radio [Lautstaerke=" + volume + (isOn ? ", ist an]" : ", ist aus]");
	}

}
