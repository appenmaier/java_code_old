package exercises.tutego;

import exercises.tutego.toaster.Toaster;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP165 {

	public static void main(String[] args) {

		Toaster toaster1 = new Toaster();
		Toaster toaster2 = new Toaster();

		boolean isEqual = toaster1.equals(toaster2);
		System.out.println("isEqual: " + isEqual);

	}

}
