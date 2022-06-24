package exercises.tutego.radio.v10;

import java.util.ArrayList;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.7
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP167 {

	public static void main(String[] args) {

		ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

		Radio radio = new Radio();
		IceMachine iceMachine = new IceMachine();
		Firebox firebox = new Firebox();

		electronicDevices.add(radio);
		electronicDevices.add(iceMachine);
		electronicDevices.add(firebox);

		for (ElectronicDevice e : electronicDevices) {
			System.out.println(e.toString());
		}

	}

}
