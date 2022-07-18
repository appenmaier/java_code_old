package exercises.tutego;

import exercises.tutego.radio.v1.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.1.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP111 {

	public static void main(String[] args) {

		Radio radio = new Radio();

		radio.isOn = true;
		radio.volume = 3;

		System.out.println("radio.isOn: " + radio.isOn);
		System.out.println("radio.volume: " + radio.volume);

	}

}
