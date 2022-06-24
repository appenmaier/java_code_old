package exercises.tutego.radio.v3;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.1.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP113 {

	public static void main(String[] args) {

		Radio radio = new Radio();

		System.out.println(radio.toString());

		radio.on();
		radio.volumeUp();
		radio.volumeUp();
		radio.volumeUp();

		System.out.println(radio.toString());

		radio.volumeDown();
		radio.off();

		System.out.println(radio.toString());

		// radio.volume = 11;
		// radio.isOn = true;

	}

}
