package exercises.tutego;

import exercises.tutego.radio.v10.Firebox;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.6
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP166 {

	public static void main(String[] args) {

		Firebox firebox = new Firebox();
		System.out.println("isOn: " + firebox.isOn());

		firebox.off();
		System.out.println("isOn: " + firebox.isOn());

	}

}
